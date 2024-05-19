package com.example.examenparcial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

data class Stadium(val imageResId: Int, val name: String, val location: String, val capacity: String)

class StadiumsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_stadium)

        val stadiums = listOf(
            Stadium(R.drawable.logo, "Mercedes-Benz Stadium", "Atlanta, GA", "71,000"),
            Stadium(R.drawable.logo, "Hard Rock Stadium", "Miami Gardens, FL", "65,300"),
            Stadium(R.drawable.logo, "GEHA Field at Arrowhead", "Kansas City, MO", "76,400"),
            Stadium(R.drawable.logo, "Q2 Stadium", "Austin, TX", "20,700"),
            Stadium(R.drawable.logo, "AT&T Stadium", "Arlington, TX", "80,000"),
            Stadium(R.drawable.logo, "Bank of America Stadium", "Charlotte, NC", "71,000"),
            Stadium(R.drawable.logo, "MetLife Stadium", "East Rutherford, NJ", "82,500"),
            Stadium(R.drawable.logo, "State Farm Stadium", "Glendale, AZ", "63,400"),
            Stadium(R.drawable.logo, "NGR Stadium", "Houston, TX", "72,220")
        )

        val rvStadiums: RecyclerView = findViewById(R.id.rvStadiums)
        rvStadiums.layoutManager = LinearLayoutManager(this)
        rvStadiums.adapter = StadiumAdapter(stadiums)

        val btnGoToMenu: Button = findViewById(R.id.btnGoToMenu)
        btnGoToMenu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}
