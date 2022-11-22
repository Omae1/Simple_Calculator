package com.wil.calcwebintentweb

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.util.jar.Manifest

class Intentactivity : AppCompatActivity() {
    lateinit var Buttonsms: Button
    lateinit var Buttoncamera: Button
    lateinit var Buttonshare: Button
    lateinit var Buttoncall: Button
    lateinit var Buttonstk: Button
    lateinit var Buttonemail: Button
    lateinit var Buttondial: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intentactivity)
        Buttonsms = findViewById(R.id.btn_sms)
        Buttoncamera = findViewById(R.id.btn_camera)
        Buttoncall = findViewById(R.id.btn_call)
        Buttondial = findViewById(R.id.btn_dial)
        Buttonemail = findViewById(R.id.btn_email)
        Buttonstk = findViewById(R.id.btn_mpesa)
        Buttonshare = findViewById(R.id.btn_share)

        Buttonsms.setOnClickListener {
            var SMS = Uri.parse("smsto: 0723462719")
            val intent = Intent(Intent.ACTION_SENDTO, SMS)
            intent.putExtra("Hello", "How is today's weather")
            startActivity(intent)
        }
        Buttoncamera.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(takePictureIntent)
        }
        Buttoncall.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "0723462719"))

            if (ContextCompat.checkSelfPermission(
                    this@Intentactivity,
                    android.Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@Intentactivity,
                    arrayOf(android.Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)
            }


        }
        Buttonshare.setOnClickListener {
            val shareIntent =  Intent(Intent.ACTION_SEND)
            shareIntent.flags= Intent.FLAG_ACTIVITY_NEW_TASK
            shareIntent.type="text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")
            startActivity(shareIntent)
        }
        Buttondial.setOnClickListener {
            val phone = "0723462719"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            startActivity(intent)

        }
        Buttonemail.setOnClickListener {

            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "Clintonndege06.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }
        Buttonstk.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) }

        }
    }
}