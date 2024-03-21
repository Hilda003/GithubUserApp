package com.example.core

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.core.databinding.ItemRowUserBinding
import com.example.core.domain.model.User


class ItemUserAdapter(private val userList: ArrayList<User>, private val clickListener: (String, View) -> Unit):
    RecyclerView.Adapter<ItemUserAdapter.UserViewHolder>() {

    @SuppressLint("NotifyDataSetChanged")
    fun setDataUser(itemsUser: List<User>?) {
       userList.clear()
        itemsUser?.let { userList.addAll(it) }
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder =
        UserViewHolder(ItemRowUserBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) = holder.bind(userList[position], clickListener)

    override fun getItemCount(): Int {
        return userList.size
    }

        inner class UserViewHolder(private val binding: ItemRowUserBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(user: User, click: (String, View) -> Unit) {
            binding.data = user
            binding.root.transitionName = user.name
            binding.root.setOnClickListener { click(user.name, binding.root) }
        }
    }
}