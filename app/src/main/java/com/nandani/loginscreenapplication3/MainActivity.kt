package com.nandani.loginscreenapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText

import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var email:EditText
    lateinit var Password: EditText
    lateinit var forgetpassword:TextView
    lateinit var Login: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        email = findViewById(R.id.email)
        Password = findViewById(R.id.Password)
        forgetpassword = findViewById(R.id.forgetpassword)
        Login = findViewById(R.id.Login)

        Login.setOnClickListener {
            System.out.println("Button is Clicked")
        }

            if (email.text.isNullOrEmpty()) {

                email.error = resources.getString(R.string.please_enter_Email)
            }
                 else if (Password.text.isNullOrEmpty()) {
                     Password.error=resources.getString(R.string.please_enter_password)

                }
                else if(Password.text.length<6){
                    Password.error=resources.getString(R.string.short_pass)
            }
                else {
                Toast.makeText(
                    this,
                    resources.getString(R.string.login_successfully),
                    Toast.LENGTH_LONG).show()


            }
        }
    }




