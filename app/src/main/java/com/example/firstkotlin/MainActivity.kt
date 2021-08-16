package com.example.firstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var buttonSave: Button
    private lateinit var textViewName: TextView
    private lateinit var editTextName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonSave = findViewById(R.id.buttonSave)
        textViewName = findViewById(R.id.textViewName)
        editTextName = findViewById(R.id.editTextName)
        buttonSave.setOnClickListener {
            View.OnClickListener {
                val name = editTextName.text.toString().trim()
                textViewName.setText("Hello, $name")
            }
        }
    }
}