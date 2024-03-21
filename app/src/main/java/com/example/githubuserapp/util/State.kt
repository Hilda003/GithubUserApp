package com.example.githubuserapp.util

import com.example.githubuserapp.databinding.FragmentFavoriteBinding
import com.example.githubuserapp.databinding.FragmentFollowBinding
import com.example.githubuserapp.databinding.FragmentHomeBinding

interface State {
    fun onSuccessState(homeBinding: FragmentHomeBinding? = null,
                       followBinding: FragmentFollowBinding? = null,
                       favoriteBinding: FragmentFavoriteBinding? = null)

    fun onErrorState(homeBinding: FragmentHomeBinding? = null,
                     followBinding: FragmentFollowBinding? = null,
                     favoriteBinding: FragmentFavoriteBinding? = null)
    fun onLoadingState(homeBinding: FragmentHomeBinding? = null,
                       followBinding: FragmentFollowBinding? = null,
                       favoriteBinding: FragmentFavoriteBinding? = null)
}