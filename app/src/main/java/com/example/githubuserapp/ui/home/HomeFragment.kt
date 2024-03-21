package com.example.githubuserapp.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.core.ItemUserAdapter
import com.example.githubuserapp.R
import com.example.githubuserapp.databinding.FragmentFavoriteBinding
import com.example.githubuserapp.databinding.FragmentFollowBinding
import com.example.githubuserapp.databinding.FragmentHomeBinding
import com.example.githubuserapp.util.State
import com.example.githubuserapp.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.core.parameter.ParametersDefinition
import org.koin.core.qualifier.Qualifier


class HomeFragment : Fragment(), State{
    private lateinit var homeBinding: FragmentHomeBinding
    private lateinit var homeAdapter: ItemUserAdapter
    private val homeViewModel : HomeViewModel by lazy {
        ViewModelProvider(this)[HomeViewModel::class.java]
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)

        homeAdapter = ItemUserAdapter(arrayListOf()) { username, iv ->

        }


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val actionBar = (activity as AppCompatActivity).supportActionBar
        actionBar?.title = getString(R.string.app_name)
        homeBinding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return homeBinding.root

    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun onSuccessState(
        homeBinding: FragmentHomeBinding?,
        followBinding: FragmentFollowBinding?,
        favoriteBinding: FragmentFavoriteBinding?
    ) {
        TODO("Not yet implemented")
    }

    override fun onErrorState(
        homeBinding: FragmentHomeBinding?,
        followBinding: FragmentFollowBinding?,
        favoriteBinding: FragmentFavoriteBinding?
    ) {
        TODO("Not yet implemented")
    }

    override fun onLoadingState(
        homeBinding: FragmentHomeBinding?,
        followBinding: FragmentFollowBinding?,
        favoriteBinding: FragmentFavoriteBinding?
    ) {
        TODO("Not yet implemented")
    }
}