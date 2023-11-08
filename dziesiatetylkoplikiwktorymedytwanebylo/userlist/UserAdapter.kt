package com.example.myapplicationwfegrmj.userlist
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplicationwfegrmj.R

class UserAdapter(val userList: ArrayList<User>, val onUserClickListener : OnUserClickListener   ) : RecyclerView.Adapter<UserItemViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_contact, parent, false)

        return UserItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserItemViewHolder, position: Int) {
        val objectData = userList.get(position)

        holder.userName.text = objectData.name
        holder.age.text = objectData.age
        Glide.with(holder.avatarurl.context).load(objectData.avatarUrl).into(holder.avatarurl)

        holder.container.setOnClickListener{
            onUserClickListener.onClickListener(objectData)
        }
    }
}
class UserItemViewHolder(view: View) : RecyclerView.ViewHolder(view){
    val userName = view.findViewById<TextView>(R.id.name)
    val age = view.findViewById<TextView>(R.id.age)
    val avatarurl = view.findViewById<ImageView>(R.id.avatarURL)
    val container = view.findViewById<ConstraintLayout>(R.id.container)
}

interface OnUserClickListener{
    fun onClickListener(user: User)
}