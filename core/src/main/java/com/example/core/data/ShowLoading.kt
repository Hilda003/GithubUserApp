package com.example.core.data

sealed class ShowLoading<T> (val data: T? = null) {

    class Success<T>(data: T?): ShowLoading<T>(data)
    class Error<T>(data: T? = null): ShowLoading<T>(data)
    class Loading<T>(data: T? = null): ShowLoading<T>(data)
}