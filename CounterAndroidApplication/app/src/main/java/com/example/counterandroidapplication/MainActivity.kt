package com.example.counterandroidapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
class MainActivity : AppCompatActivity() {

    private lateinit var countTextView: TextView
    private lateinit var decrementButton: Button
    private lateinit var incrementButton: Button
    private lateinit var resetButton: Button

    private var count = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countTextView = findViewById(R.id.countTextView)
        decrementButton = findViewById<Button>(R.id.decrementButton)
        incrementButton = findViewById<Button>(R.id.incrementButton)
        resetButton = findViewById<Button>(R.id.resetButton)

        decrementButton.setOnClickListener {
            decrementCount()
        }

        incrementButton.setOnClickListener {
            incrementCount()
        }

        resetButton.setOnClickListener {
            resetCount()
        }

        updateCountTextView()
    }

    private fun decrementCount() {
        count--
        updateCountTextView()
    }

    private fun incrementCount() {
        count++
        updateCountTextView()
    }

    private fun resetCount() {
        count = 0
        updateCountTextView()
    }

    private fun updateCountTextView() {
        countTextView.text = count.toString()
    }
}