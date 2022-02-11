package com.example.loginvalidation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.btn_login)
        val username = findViewById<EditText>(R.id.txt_username)
        val password = findViewById<EditText>(R.id.txt_password)
        button1.setOnClickListener {
            if (username.text.toString().length == 0) {
                Toast.makeText(this, "Please enter username", Toast.LENGTH_SHORT).show();
            } else if (password.text.toString().length == 0) {
                Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show();
            } else if (password.text.toString().length < 8) {
                Toast.makeText(this, "Please enter valid password", Toast.LENGTH_SHORT).show();
            } else {
                val intent = Intent(this, Second::class.java)
                startActivity(intent)
            }
        }
    }
}