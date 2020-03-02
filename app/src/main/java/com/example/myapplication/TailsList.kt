package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class TailsList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tails_list)

        val toolbar = findViewById<ImageButton>(R.id.backBtnImage)
        //Button to go back
        toolbar.setOnClickListener {
            val toList = Intent (this,MainActivity::class.java)
            startActivity(toList)
        }
    }

    //Button to play game
    fun playGame(view: View){
        val toList = Intent (this,AnimationActivity::class.java)
        startActivity(toList)
    }
}
