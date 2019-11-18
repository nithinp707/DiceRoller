package com.example.android.diceroller.aboutme

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.android.diceroller.R
import kotlinx.android.synthetic.main.layout_my_views.*

class MyViewsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_my_views)

        setListeners()

    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(box_one_text, box_two_text, box_three_text, box_four_text, box_five_text)

        for (item in clickableViews) {
            item.setOnClickListener {
                makeColored(it)
            }
        }
    }

    private fun makeColored(it: View?) {
        when (it?.id) {
            R.id.box_one_text -> it.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> it.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> it.setBackgroundResource(android.R.color.holo_red_light)
            R.id.box_four_text -> it.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> it.setBackgroundResource(android.R.color.holo_red_light)

            else -> it?.setBackgroundColor(Color.LTGRAY)
        }
    }
}