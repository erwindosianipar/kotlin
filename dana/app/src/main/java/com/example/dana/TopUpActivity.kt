package com.example.dana

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TopUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.topup_layout)

        val balance = intent.getStringExtra("balance")
        val setBalance = findViewById<TextView>(R.id.balance)
        setBalance.setText(balance)
    }

    fun topUpClick(view: View){
        val balance = findViewById<TextView>(R.id.balance).text.toString().toInt()
        val amount = findViewById<EditText>(R.id.amount).text.toString().toInt()
        val saveTopUp = (balance+amount).toString()
        val newIntent = Intent(this, MainActivity::class.java).apply {
            putExtra("balance", saveTopUp)
        }
        startActivity(newIntent)
    }

    override fun onStop() {
        super.onStop()
        val toast = Toast.makeText(this, "Top up success.", Toast.LENGTH_SHORT)
        toast.show()
    }
}