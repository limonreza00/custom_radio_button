package com.torchtech.customradiobuttons

import android.graphics.Color
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
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
        val textView = findViewById<TextView>(R.id.textView)
        textView.text ="Start"

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val checkedButton = findViewById<RadioButton>(checkedId)
            val selectedText = checkedButton.text.toString()
            textView.text = selectedText
        }

    }
}