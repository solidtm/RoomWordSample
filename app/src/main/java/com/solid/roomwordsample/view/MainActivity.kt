package com.solid.roomwordsample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.solid.roomwordsample.R
import com.solid.roomwordsample.databinding.ActivityMainBinding
import com.solid.roomwordsample.view.adapter.WordListAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val adapter = WordListAdapter()
        val rv = binding.recyclerview
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(this)
        setContentView(binding.root)

    }
}