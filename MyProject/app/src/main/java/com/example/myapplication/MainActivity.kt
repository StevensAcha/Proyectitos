package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESS = "com.example.app.myapplication"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage(view: View){
        val editText = findViewById<EditText>(R.id.editTextText)
        val message = editText.text.toString()

        //utilizar el intent: vinculación entre componentes en tiempo de ejecución
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESS, message) //message es el valor que ingresamos / string
        }

        startActivity(intent)
    }
}