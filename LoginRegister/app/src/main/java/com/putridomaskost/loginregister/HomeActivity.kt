package com.putridomaskost.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.widget.Toolbar
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var toolbar = null
        toolbar?.let { supportActionBar(it) }



    }

    private fun supportActionBar(toolbar: Any) {
        img_menu.setOnClickListener {
            startActivity(Intent(this, navigationMenu::class.java))
        }

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater
        var inflater = getMenuInflater();
        inflater.inflate(R.menu.navigation_menu, menu);

        return true;
    }
}

