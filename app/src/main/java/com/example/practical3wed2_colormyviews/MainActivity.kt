package com.example.practical3wed2_colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {

        val boxOneText: ImageView = findViewById(R.id.box_one_text)
        val boxTwoText: ImageView = findViewById(R.id.box_two_text)
        val boxThreeText: ImageView = findViewById(R.id.box_three_text)
        val boxFourText: ImageView = findViewById(R.id.box_four_text)
        val boxFiveText: ImageView = findViewById(R.id.box_five_text)


        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)


        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
    private fun makeColored(view: View){

        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.tabback)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.user)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.tabback)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.tabback)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.tabback)
            else -> view.setBackgroundResource(R.drawable.background)
        }
    }


}
