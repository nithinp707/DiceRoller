package com.example.android.diceroller.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.android.diceroller.R
import kotlin.random.Random

class DiceActivity : AppCompatActivity() {
    private lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_dice)
        val rollButton: Button = findViewById(R.id.rollButton)
        diceImage = findViewById(R.id.diceImage)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val diceImageRes = when (Random.nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(diceImageRes)
    }
}
