package com.example.calculator2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.calculator2.Models.Calc

class MainActivity : AppCompatActivity() {

    lateinit var no1 : EditText
    lateinit var no2 : EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        no1 = findViewById(R.id.edtNo1)
        no2 = findViewById(R.id.edtNo2)
    }

    fun buttonClick(v:View) {
        var answer : Double = 0.0

        val cal = Calc (
            no1.text.toString().toDouble(),
            no2.text.toString().toDouble()
        )

        when(v.id) {

            R.id.btnAdd -> answer = cal.add()
            R.id.btnSub -> answer = cal.sub()
            R.id.btnMul -> answer = cal.multiply()
            R.id.btnDevide -> answer = cal.devide()
        }

        Toast.makeText(this, "Answer = $answer ", Toast.LENGTH_LONG).show()
    }
}