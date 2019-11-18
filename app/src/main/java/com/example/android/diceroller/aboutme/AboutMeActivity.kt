package com.example.android.diceroller.aboutme

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.android.diceroller.R
import com.example.android.diceroller.databinding.LayoutAboutMeBinding

class AboutMeActivity : AppCompatActivity() {

    private val myName = MyName("Simjo", "Aashan")

    private lateinit var binding: LayoutAboutMeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_about_me)

        binding = DataBindingUtil.setContentView(this, R.layout.layout_about_me)

        binding.myName = myName




    }
}