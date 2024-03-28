package com.example.spurscommunity

import android.os.Bundle
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
            val newsTextView = findViewById<TextView>(R.id.newsTextView)
            newsTextView.text = "Harry Kane to return to Tottenham as Spurs face emotional reunion with former striker"
            val fixturesTextView = findViewById<TextView>(R.id.fixturesTextView)
            fixturesTextView.text = "Tottenham Hotspur vs Luton Town"
        }
    }
}