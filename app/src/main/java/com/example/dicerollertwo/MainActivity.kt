package com.example.dicerollertwo

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    lateinit var diceImageTwo: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        diceImageTwo = findViewById(R.id.dice_image_two)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice(){
        diceImage.setImageResource(getRandomDiceImage())
        diceImageTwo.setImageResource(getRandomDiceImage())
    }

    private fun getRandomDiceImage(): Int {
        var a = when ((1..6).random()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return a
    }
}