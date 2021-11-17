package com.app.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.newsapp.adapter.SectionPagerAdapater
import com.app.newsapp.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        binding.vpNews.adapter = SectionPagerAdapater(this)

        val tabList = arrayOf("All News", "Top", "Popular",)
        TabLayoutMediator(binding.tabs,binding.vpNews){tab, position ->
            tab.text = tabList[position]
        }.attach()
    }
}