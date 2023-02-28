package com.igti.mysubscribers.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.igti.mysubscribers.R
import com.igti.mysubscribers.data.model.User

class MainAdapter(private val users: ArrayList<User>) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) {
            val textViewUserName = itemView.findViewById<AppCompactTextView>(R.id.textViewUserName)
            textViewUserName.text = user.login

            val textViewUserEmail = itemView.findViewById<AppCompactTextView>(R.id.textViewUserEmail)
            textViewUserEmail.text = user.url

            val imageViewAvatar = itemView.findViewById<AppCompactTextView>(R.id.imageViewAvatar)
            Glide.with(imageViewAvatar.context)
                .load(user.avatar)
                .into(imageViewAvatar)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout, parent,
                false
            )
        )

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(users[position])

    fun addData(list: List<User>) {
        users.addAll(list)
    }
}