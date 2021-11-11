package com.example.buildvariant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        app_name.text = BuildConfig.appName
        url.text = BuildConfig.BASE_URL
        url.text = BuildConfig.ABC
    }
}