package com.teodor.mytsyk.todo.ui.mvp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.teodor.mytsyk.todo.R
import com.teodor.mytsyk.todo.ui.mvp.home.HomeView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentManager.beginTransaction()
                .replace(R.id.activity_main, HomeView())
                .commit()
    }
}
