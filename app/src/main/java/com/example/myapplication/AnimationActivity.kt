package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView

class AnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        val lottie = findViewById<LottieAnimationView>(R.id.animation)

        //search animation file
        lottie.apply {
            setAnimation(R.raw.lottie404)
            playAnimation()
        }

    }
}
