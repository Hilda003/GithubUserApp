package com.example.core.data.retrofit

import com.example.core.data.response.ResponseDetailUser
import com.example.core.data.response.ResponseUser
import retrofit2.http.GET
import retrofit2.http.Path


interface ApiService {

    @GET("users/{username}")
    suspend fun getDetailUser(
        @Path("username") username: String?
    ): ResponseDetailUser

    @GET("users/{username}/followers")
    suspend fun getUserFollowers(
        @Path("username") username: String?
    ): List<ResponseDetailUser>

    @GET("users/{username}/following")
    suspend fun getUserFollowing(
        @Path("username") username: String?
    ): List<ResponseDetailUser>

    @GET("search/users")
    suspend fun searchUsers(
        @Path("q") q: String?
    ): ResponseUser
}
