package com.example.core.domain.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
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
) : Parcelable
