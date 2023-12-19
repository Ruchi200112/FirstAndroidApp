package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val registerHere : TextView = findViewById(R.id.textViewRegister)

        registerHere.setOnClickListener{
            val intent = Intent(this@MainActivity,RegistrationActivity::class.java)
            startActivity(intent)

        }

        buttonLogin.setOnClickListener{
            if (editTextEmail.text.isNullOrBlank() || editTextPassword.text.isNullOrBlank()){
                Toast.makeText(this@MainActivity, "Please Enter Email and Password", Toast.LENGTH_SHORT).show()
            }
            else if(editTextEmail!!.text!!.length <= 6 || editTextPassword.text!!.length <= 6){
                Toast.makeText(this@MainActivity, "Please Enter Email and Password min 6 digit", Toast.LENGTH_SHORT).show()
        }
            else{
                val intent = Intent(this@MainActivity,HomeActivity::class.java)
                startActivity(intent)
            }
        }

    }
}