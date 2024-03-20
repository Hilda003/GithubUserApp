package com.example.githubuserapp.di

import com.example.core.domain.usecase.InteractorUser
import com.example.core.domain.usecase.UseCaseUser
import com.example.githubuserapp.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val moduleUseCase = module {
    factory<UseCaseUser> { InteractorUser(get()) }
}

val moduleViewModel = module {
    viewModel { HomeViewModel(get()) }

}