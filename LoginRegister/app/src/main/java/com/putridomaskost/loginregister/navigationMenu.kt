package com.putridomaskost.loginregister

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*

abstract class navigationMenu() : AppCompatActivity(), Parcelable {

        @SuppressLint("ResourceType")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.menu.navigation_menu)
            var toolbar = null
            toolbar?.let { supportActionBar(it) }


        }

        private fun supportActionBar(toolbar: Any) {
            img_menu.setOnClickListener {
                startActivity(Intent(this, menuInflater::class.java))
            }

        }


        override fun onCreateOptionsMenu(menu: Menu): Boolean {
            menuInflater
            var inflater = getMenuInflater();
            inflater.inflate(R.menu.navigation_menu, menu);

            return true;
        }
    }




    private fun setContentView(navigationMenu: Int) {

    }

    private fun supportActionBar(it: Nothing) {
        TODO("Not yet implemented")
    }

