package com.putridomaskost.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        txtLoginListener()
        btnBackListener()
        btnRegistListener()
    }
    private fun txtLoginListener() {
        txt_login.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
    private fun btnBackListener() {
        R_img_2.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
    private fun btnRegistListener() {
        R_btn_1.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}