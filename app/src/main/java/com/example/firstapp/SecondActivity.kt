package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        saveAddressBtn.setOnClickListener {
            if (etPhoneNo.text.length <= 10 || etPhoneNo.text.startsWith("+91")) {
               Toast.makeText(this@SecondActivity, "Please check your phone number", Toast.LENGTH_SHORT).show()

            }
            else{
                Toast.makeText(this@SecondActivity, "Saved Successfully..", Toast.LENGTH_SHORT).show()
            }

        }
    }

}