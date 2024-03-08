package com.torchtech.customradiobuttons

import android.graphics.Color
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val radioStart = findViewById<RadioButton>(R.id.radioStart)
        val radioCenter = findViewById<RadioButton>(R.id.radioCenter)
        val radioEnd = findViewById<RadioButton>(R.id.radioEnd)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val radioButton = findViewById<RadioButton>(checkedId)

            if (radioButton.isChecked){
                radioButton.setBackgroundColor(Color.BLUE)
                radioButton.setTextColor(Color.WHITE)
            }
            radioButton.setBackgroundColor(Color.BLUE)
            radioButton.setTextColor(Color.WHITE)
        }
    }
}