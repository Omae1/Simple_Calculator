package com.wil.calcwebintentweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var buttoncalc:Button
    lateinit var buttonintent:Button
    lateinit var buttonweb:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttoncalc= findViewById(R.id.btn_calc)
        buttonintent=findViewById(R.id.btn_intent)
        buttonweb=findViewById(R.id.btn_web)

        buttoncalc.setOnClickListener {
            val calc= Intent(this, Calcactivity::class.java)
            startActivity(calc)
            Toast.makeText(this,"Clicked me", Toast.LENGTH_SHORT).show()
        }
        buttonintent.setOnClickListener {
            val intention=Intent(this, Intentactivity::class.java)
            startActivity(intention)
        }
        buttonweb.setOnClickListener {
            val web= Intent(this,Webactivity::class.java)
            startActivity(web)
        }
    }
}