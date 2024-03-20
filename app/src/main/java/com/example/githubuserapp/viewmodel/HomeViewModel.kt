package com.example.githubuserapp.viewmodel

import androidx.lifecycle.*
import com.example.core.data.ShowLoading
import com.example.core.domain.model.User
import com.example.core.domain.usecase.UseCaseUser



class HomeViewModel (useCaseUser: UseCaseUser) : ViewModel() {
    private var username: MutableLiveData<String> = MutableLiveData()


    fun setSearch(q: String) {
        if (username.value == q) {
            return
        }
        username.value = q
    }


   
}