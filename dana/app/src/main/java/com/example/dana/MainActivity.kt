package com.example.dana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val balance = intent.getStringExtra("balance")
        val setBalance = findViewById<TextView>(R.id.balance)
        setBalance.setText(balance)
    }

    fun switchToTopUp(view: View){
        val balance = findViewById<TextView>(R.id.balance).text.toString()
        val newIntent = Intent(this, TopUpActivity::class.java).apply {
            putExtra("balance", balance)
        }
        startActivity(newIntent)
    }

    fun switchToTransfer(view: View){
        val balance = findViewById<TextView>(R.id.balance).text.toString()
        val newIntent = Intent(this, TransferActivity::class.java).apply {
            putExtra("balance", balance)
        }
        startActivity(newIntent)
    }
}
