package com.example.myapplicationwfegrmj.conversationsdetails

import android.os.Bundle
import android.os.Message
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplicationwfegrmj.databinding.ActivityConversationDetailsBinding

class ConversationsDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding =  ActivityConversationDetailsBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        val context = this
        with(binding){
            conversationRecyclerView.adapter =ConversationAdapter(messageList, 2)
            conversationRecyclerView.layoutManager = LinearLayoutManager(context)
        }
        
    }

    val messageList = arrayListOf<com.example.myapplicationwfegrmj.conversationsdetails.Message>(
        Message("czesc",1,"https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        Message("wefw",2,"https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        Message("wgsgsew",3,"https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        Message("wgeagw",4,"https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        Message("wwsgs",5,"https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        Message("gesww",1,"https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        Message("wgesgw",1,"https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        Message("wssegesw",2,"https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        Message("wgesgsew",2,"https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        Message("gseww",1,"https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        Message("wgesegsgw",2,"https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        Message("wsegsw",1,"https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        Message("whkgw",2,"https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        Message("wkgw",1,"https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        Message("wwyf",1,"https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        Message("wtfjw",1,"https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        Message("wfjtw",2,"https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        Message("wftw",2,"https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),
        Message("whdw",3,"https://www.shareicon.net/data/512x512/2015/09/18/103160_man_512x512.png"),



    )

}