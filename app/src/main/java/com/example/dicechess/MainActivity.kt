package com.example.dicechess

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        //declaring dices
        val diceImages = listOf(
                R.drawable.dice_1,
                R.drawable.dice_2,
                R.drawable.dice_3,
                R.drawable.dice_4,
                R.drawable.dice_5,
                R.drawable.dice_6
        )

        val dice1: ImageView = findViewById(R.id.dice1)
        val dice2: ImageView = findViewById(R.id.dice2)
        val dice3: ImageView = findViewById(R.id.dice3)

        val rollButton: Button = findViewById(R.id.rollButton)

        rollButton.setOnClickListener {
            // Roll each dice
            val shakeAnimation = AnimationUtils.loadAnimation(this, R.anim.shake)
            dice1.startAnimation(shakeAnimation)
            dice2.startAnimation(shakeAnimation)
            dice3.startAnimation(shakeAnimation)

            dice1.setImageResource(diceImages.random())
            dice2.setImageResource(diceImages.random())
            dice3.setImageResource(diceImages.random())


        }
    }
}