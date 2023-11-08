package com.example.myapplicationwfegrmj.userlist

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplicationwfegrmj.conversationsdetails.ConversationsDetailsActivity
import com.example.myapplicationwfegrmj.databinding.ActivityUsersListBinding
import com.example.myapplicationwfegrmj.userlist.User
import com.example.myapplicationwfegrmj.userlist.UserAdapter

class UserListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityUsersListBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        val context =this
        with(binding){
            userrecyclerview.adapter = UserAdapter(userlist, object : OnUserClickListener{
                override fun onClickListener(user: User) {
                    println(user.name)
                    val conversationDetailsIntent = Intent(context, ConversationsDetailsActivity::class.java)
                    startActivity(conversationDetailsIntent)
                }
            })
            userrecyclerview.layoutManager = LinearLayoutManager(context)
        }


    }
    val userlist = arrayListOf<User>(
        User("iwii","12","https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        User("iafgaei","12","https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        User("iwagseii","12","https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        User("iwafwegwii","12","https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        User("iwrxgrii","12","https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        User("iwvzii","12","https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        User("iwGAESEjstjii","12","https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        User("iwtfxjii","12","https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        User("iwfxkfxktii","12","https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        User("iwkzzesii","12","https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        User("iwhyfkdii","12","https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        User("iwzii","12","https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        User("iwretryii","12","https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        User("iwesrii","12","https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        User("iwueszryii","12","https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        User("iwetzii","12","https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        User("iweawtzii","12","https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        User("iweawftzii","12","https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        User("iwethhtjzii","12","https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        User("iwemymymtzii","12","https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),


        )
}