package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.SecondActivityBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        val binding2 = SecondActivityBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        with(binding){
            button.setOnClickListener{
                setContentView(binding2.root)
                layout1.setOnClickListener {

                }
            }
            buttonemail.setOnClickListener {
                val emailIntent = Intent(Intent.ACTION_SEND)
                emailIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                emailIntent.setType("vnd.android.cursor.item/email");
                startActivity(Intent.createChooser(emailIntent, "Send mail using..."))
            }
        }


    }
}