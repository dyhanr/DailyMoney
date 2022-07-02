package com.example.dailymoney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

       txtSignUp.setOnClickListener(){
            intent = Intent(this,Signup::class.java)
            startActivity(intent)
        }
        buttonLogin.setOnClickListener() {
            intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }
    }
}
