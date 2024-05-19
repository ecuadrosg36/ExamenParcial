package com.example.examenparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnPrizes: Button = findViewById(R.id.btnPrizes)
        val btnTeams: Button = findViewById(R.id.btnTeams)
        val btnStadiums: Button = findViewById(R.id.btnStadiums)

        btnPrizes.setOnClickListener {
            val intent = Intent(this, PrizesActivity::class.java)
            startActivity(intent)
        }

        btnTeams.setOnClickListener {
            val intent = Intent(this, TeamsActivity::class.java)
            startActivity(intent)
        }
        btnStadiums.setOnClickListener {
            val intent = Intent(this, StadiumAdapter::class.java)
            startActivity(intent)
        }

    }
}