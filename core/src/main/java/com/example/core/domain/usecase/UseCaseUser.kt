package com.example.core.domain.usecase

import com.example.core.data.ShowLoading
import com.example.core.domain.model.User
import kotlinx.coroutines.flow.Flow

interface UseCaseUser {

    fun getSearchUser(q: String?) : Flow<ShowLoading<List<User>>>

}