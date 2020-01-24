package com.example.dana

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TransferActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.transfer_layout)

        val balance = intent.getStringExtra("balance")
        val setBalance = findViewById<TextView>(R.id.balance)
        setBalance.setText(balance)
    }

    fun transferClick(view: View){
        val balance = findViewById<TextView>(R.id.balance).text.toString().toInt()
        val amount = findViewById<EditText>(R.id.amount).text.toString().toInt()

        if (amount>balance) {
            val toast = Toast.makeText(this, "Oops, your balance is not enough.", Toast.LENGTH_SHORT)
            toast.show()
            return
        }

        val saveTopUp = (balance-amount).toString()
        val newIntent = Intent(this, MainActivity::class.java).apply {
            putExtra("balance", saveTopUp)
        }
        startActivity(newIntent)
    }

    override fun onStop() {
        super.onStop()
        val toast = Toast.makeText(this, "Transfer success.", Toast.LENGTH_SHORT)
        toast.show()
    }
}