package com.example.android.diceroller

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.diceroller.trivia.TriviaHome
import com.example.android.diceroller.aboutme.AboutMeActivity
import com.example.android.diceroller.aboutme.MyViewsActivity
import com.example.android.diceroller.diceroller.DiceActivity
import kotlinx.android.synthetic.main.layout_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_home)

        buttonDiceRoller.setOnClickListener {
            startActivity(Intent(this, DiceActivity::class.java))
        }

        buttonAboutMe.setOnClickListener {
            startActivity(Intent(this, AboutMeActivity::class.java))
        }

        buttonColorMyViews.setOnClickListener {
            startActivity(Intent(this, MyViewsActivity::class.java))
        }


        buttonTrivia.setOnClickListener {
            startActivity(Intent(this, TriviaHome::class.java))
        }


    }
}