package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Switching to another activity
    fun goToList(view: View){
        val toList = Intent (this,TailsList::class.java)
        startActivity(toList)
    }

    private var doubleBackToExitOnce: Boolean = false

    //Exit from application
     fun onBackPressed(view: View) {
        if (doubleBackToExitOnce) {
            super.onBackPressed()
            return
        }

        this.doubleBackToExitOnce = true
        //displays a toast message when user clicks exit button
        val toast = Toast.makeText(
            applicationContext,
            "Пожалуйса нажмите еще раз", Toast.LENGTH_SHORT
        )
        toast.show()
        //displays the toast message for a while
        Handler().postDelayed({
            kotlin.run { doubleBackToExitOnce = false }
        }, 2000)
    }
}



