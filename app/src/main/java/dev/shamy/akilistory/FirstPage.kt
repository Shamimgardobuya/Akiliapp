package dev.shamy.akilistory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstPage : AppCompatActivity() {
        lateinit var btnBack1:Button
        lateinit var btnNextt:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)
        btnBack1=findViewById(R.id.btnBack1)
        btnNextt=findViewById(R.id.btnNextt)
        btnBack1.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnNextt.setOnClickListener {
            val intent=Intent(this,SecondPage::class.java)
            startActivity(intent)
        }
    }
}