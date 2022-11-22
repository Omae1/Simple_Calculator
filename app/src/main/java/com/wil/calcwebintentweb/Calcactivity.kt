package com.wil.calcwebintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calcactivity : AppCompatActivity() {
    lateinit var TextAnswer: TextView
    lateinit var Firstnumber: EditText
    lateinit var Secondnumber:EditText
    lateinit var buttonadd:Button
    lateinit var buttonsubtract:Button
    lateinit var buttondivide: Button
    lateinit var buttonmultiply:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcactivity)

        buttonadd=findViewById(R.id.btn_add)
        buttonsubtract=findViewById(R.id.btn_subtraction)
        buttondivide= findViewById(R.id.btn_divide)
        buttonmultiply=findViewById(R.id.btn_multiply)
        TextAnswer=findViewById(R.id. txt_Answerhere)
        Firstnumber= findViewById(R.id. edt_firstnuumber)
        Secondnumber= findViewById(R.id.edt_secondnumber)

        buttonadd. setOnClickListener {
            var myfirstnumber= Firstnumber.text.toString()
            var mysecondnumber= Secondnumber. text.toString()

            if (myfirstnumber.isEmpty() or mysecondnumber.isEmpty()){
                TextAnswer.text="please input fields"
            }else{
                var myanswer = myfirstnumber.toDouble()+mysecondnumber.toDouble()
                TextAnswer.text= myanswer.toString()
            }
        }

        buttonsubtract.setOnClickListener {
            var myfirstnumber= Firstnumber.text.toString()
            var mysecondnumber= Secondnumber. text.toString()

            if (myfirstnumber.isEmpty() or mysecondnumber.isEmpty()){
                TextAnswer.text="please input fields"
            }else{
                var myanswer= myfirstnumber.toDouble()- mysecondnumber.toDouble()
                TextAnswer.text=myanswer.toString()
            }

        }
         buttondivide.setOnClickListener {
             var myfirstnumber = Firstnumber.text.toString()
             var mysecondnumber = Secondnumber.text.toString()

             if (myfirstnumber.isEmpty() or mysecondnumber.isEmpty()){
                 TextAnswer.text= "please input fields"
             }else{
                 var myanswer= myfirstnumber.toDouble()/mysecondnumber.toDouble()
                 TextAnswer.text=myanswer.toString()
             }
         }
        buttonmultiply.setOnClickListener {
            var myfirstnumber= Firstnumber.text.toString()
            var mysecondnumber= Secondnumber.text.toString()

            if (myfirstnumber.isEmpty() or mysecondnumber.isEmpty()){
                TextAnswer.text= "Please input fields"
            }else{
                var myanswer =myfirstnumber.toDouble() * mysecondnumber.toDouble()
                TextAnswer.text= myanswer.toString()
            }
        }

    }
}