package com.putridomaskost.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        btnLoginListener()
        btnRegiserListener()
    }
    private fun btnLoginListener() {
        btn_1.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
}
    }
    private fun btnRegiserListener() {
        btn_2.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}