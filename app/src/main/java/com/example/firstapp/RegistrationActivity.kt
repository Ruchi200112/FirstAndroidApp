package com.example.firstapp



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : AppCompatActivity() {
    private var a : String? = "3"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        Log.d("hhhh", "onCreate: ${a?.length}")
        textViewAlreadyRegistered.setOnClickListener{
            val intent1 = Intent(this,MainActivity::class.java)
            intent1.putExtra("value",a)
            startActivity(intent1)
        }

        buttonLogin1.setOnClickListener{
            if (editTextFirstname.text.isNullOrEmpty() || editTextEmail1.text.isNullOrEmpty() || editTextPassword1.text.isNullOrEmpty()){
                Toast.makeText(this, "Please enter full name,email and password", Toast.LENGTH_SHORT).show()
                Log.d("fhygj", " ${editTextFirstname.text} ${editTextEmail1.text} ${editTextPassword1.text}")
            }
            else if (editTextFirstname.text.length <= 6 || editTextPassword1.text.length <= 6){
                Toast.makeText(this, "Please enter atleast 6 characters", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent=Intent(this,HomeActivity::class.java)
                startActivity(intent)

            }

        }

    }

    fun patternCheck() : String{
        return "ruchika"
    }


}