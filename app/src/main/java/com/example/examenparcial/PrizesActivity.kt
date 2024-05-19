package com.example.examenparcial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PrizesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prizes)

        val etTotalAmount: EditText = findViewById(R.id.etTotalAmount)
        val btnCalculate: Button = findViewById(R.id.btnCalculate)
        val tvResults: TextView = findViewById(R.id.tvResults)
        val btnGoToMenu: Button = findViewById(R.id.btnGoToMenu)

        btnCalculate.setOnClickListener {
            val totalAmount = etTotalAmount.text.toString().toDoubleOrNull()
            if (totalAmount != null) {
                val firstPlace = totalAmount * 0.25
                val secondPlace = totalAmount * 0.15
                val thirdPlace = totalAmount * 0.10
                val remainingAmount = totalAmount - (firstPlace + secondPlace + thirdPlace)
                val fourthToSixteenth = remainingAmount / 13

                val results = """
                    1° place: 25% * Total amount = $firstPlace
                    2° place: 15% * Total amount = $secondPlace
                    3° place: 10% * Total amount = $thirdPlace
                    4°-16° place: (Total amount - (1°+2°+3°)) / 13 = $fourthToSixteenth
                """.trimIndent()

                tvResults.text = results
            } else {
                tvResults.text = "Please enter a valid amount"
            }
        }

        btnGoToMenu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}
