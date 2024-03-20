package com.example.core.domain

import com.example.core.data.ShowLoading
import com.example.core.domain.model.User
import kotlinx.coroutines.flow.Flow

interface InterfaceUserRepo  {

    fun getSearchUser(q: String?) : Flow<ShowLoading<List<User>>>
}