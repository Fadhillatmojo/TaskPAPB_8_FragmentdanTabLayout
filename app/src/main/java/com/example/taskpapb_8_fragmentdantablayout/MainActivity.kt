package com.example.taskpapb_8_fragmentdantablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.taskpapb_8_fragmentdantablayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            viewPager.adapter = TabAdapter(supportFragmentManager)

            // Hubungkan ViewPager dengan TabLayout
            tabLayout.setupWithViewPager(viewPager)
        }

    }
}