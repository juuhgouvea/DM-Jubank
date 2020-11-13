package com.example.jubank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btLogin.setOnClickListener { loginHandler() }
    }

    fun loginHandler(){
        var username = inputUsername.text.toString()

        if(username != "Julia"){
            Toast.makeText(this, "Usuário inválido!", Toast.LENGTH_LONG).show()
            return
        }
    }


}