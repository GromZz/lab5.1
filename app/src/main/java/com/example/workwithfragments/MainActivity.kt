package com.example.workwithfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.workwithfragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.color1, FirstFragment.newInstance())
            .commit()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.color2, SecondFragment.newInstance())
            .commit()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.color3, ThirdFragment.newInstance())
            .commit()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.color4, FourthFragment.newInstance())
            .commit()
    }
}