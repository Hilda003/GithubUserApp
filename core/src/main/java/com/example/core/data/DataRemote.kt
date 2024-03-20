package com.example.core.data

import android.util.Log
import com.example.core.data.response.ResponseUser
import com.example.core.data.response.UserResult
import com.example.core.data.retrofit.ApiResponse
import com.example.core.data.retrofit.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn


class DataRemote(private val apiService: ApiService) {

    suspend fun getSearchUsers(q: String?) : Flow<ApiResponse<List<UserResult>>> =
     flow {
         try {
                val userSearch = apiService.searchUsers(q)
                val userArray = userSearch.items
                if (userArray.isEmpty()) {
                    emit(ApiResponse.Error(null))
                } else {
                    emit(ApiResponse.Success(userArray))
                }
            } catch (e: Exception) {
                emit(ApiResponse.Error(e.toString()))
             e.localizedMessage?.let { Log.e(DataRemote::class.java.simpleName, it) }
         }
     }.flowOn(Dispatchers.IO)
}