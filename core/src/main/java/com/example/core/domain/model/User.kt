package com.example.core.domain.model

data class User(
    val login: String,
    val id: Int,
    val avatarUrl: String,
    val url: String,
    val type: String,
    val name: String,
    val location: String,
    val followers: Int,
    val following: Int,
    val favorite: Boolean
) {
}