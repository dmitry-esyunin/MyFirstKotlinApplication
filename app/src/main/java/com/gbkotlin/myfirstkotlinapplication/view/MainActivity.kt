package com.gbkotlin.myfirstkotlinapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gbkotlin.myfirstkotlinapplication.R
import com.gbkotlin.myfirstkotlinapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.getRoot()
        setContentView(view)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.ccc, MainFragment.newInstance())
                .commitNow()
        }
    }
}
