package com.example.dana

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_layout)
    }

    fun login(view: View){
        val getBalance = findViewById<EditText>(R.id.balance).text.toString()
        val newIntent = Intent(this, MainActivity::class.java).apply {
            putExtra("balance", getBalance)
        }
        startActivity(newIntent)
    }

}