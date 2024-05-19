package com.example.examenparcial

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class TeamsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teams)

        val teams = listOf(
            "Argentina", "Brasil", "Uruguay", "Colombia",
            "Estados Unidos", "Perú", "Canadá", "México",
            "Trinidad y Tobago"
        )

        val lvTeams: ListView = findViewById(R.id.lvTeams)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, teams)
        lvTeams.adapter = adapter

        val btnGoToMenu: Button = findViewById(R.id.btnGoToMenu)
        btnGoToMenu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}
