package dev.shamy.akilistory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondPage : AppCompatActivity() {
    lateinit var btnBack2:Button
    lateinit var btnNext1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)
        btnBack2=findViewById(R.id.btnBack2)
        btnNext1=findViewById(R.id.btnNext1)
        btnBack2.setOnClickListener {
            val intent=Intent(this,FirstPage::class.java)
            startActivity(intent)
        }
        btnNext1.setOnClickListener {
            val intent=Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }

    }
}