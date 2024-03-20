package com.example.core.domain.usecase

import com.example.core.data.ShowLoading
import com.example.core.data.UserRepository
import com.example.core.domain.InterfaceUserRepo
import com.example.core.domain.model.User
import kotlinx.coroutines.flow.Flow

class InteractorUser(private val interfaceUserRepo: InterfaceUserRepo) : UseCaseUser {
    override fun getSearchUser(q: String?): Flow<ShowLoading<List<User>>> {
        return interfaceUserRepo.getSearchUser(q)
    }

}