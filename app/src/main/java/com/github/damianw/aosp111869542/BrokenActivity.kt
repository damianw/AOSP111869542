package com.github.damianw.aosp111869542

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class BrokenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broken)
    }

}
