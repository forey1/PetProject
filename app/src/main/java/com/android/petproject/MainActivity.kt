package com.android.petproject

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.petproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        
        binding.apply {
            allComicsButton.setOnClickListener {
                val intent = Intent(this@MainActivity, AllComicsActivity::class.java)
                val options = ActivityOptions.makeClipRevealAnimation(it, 0, 0, it.width, it.height)
                options.toBundle()
                    ?.let { it -> startActivity(intent, it) }
            }
            allCharactersButton.setOnClickListener {
                val intent = Intent(this@MainActivity, AllCharactersActivity::class.java)
                val options = ActivityOptions.makeClipRevealAnimation(it, 0, 0, it.width, it.height)
                options.toBundle()
                    ?.let { it -> startActivity(intent, it) }
            }
            comicsByCenturyButton.setOnClickListener {
                val intent = Intent(this@MainActivity, ComicsByCenturyActivity::class.java)
                val options = ActivityOptions.makeClipRevealAnimation(it, 0, 0, it.width, it.height)
                options.toBundle()
                    ?.let { it -> startActivity(intent, it) }
            }
            comicsByPartsButton.setOnClickListener {
                val intent = Intent(this@MainActivity, ComicsByPartsActivity::class.java)
                val options = ActivityOptions.makeClipRevealAnimation(it, 0, 0, it.width, it.height)
                options.toBundle()
                    ?.let { it -> startActivity(intent, it) }
            }
            randomComicButton.setOnClickListener {
                val intent = Intent(this@MainActivity, RandomComicActivity::class.java)
                val options = ActivityOptions.makeClipRevealAnimation(it, 0, 0, it.width, it.height)
                options.toBundle()
                    ?.let { it -> startActivity(intent, it) }
            }
        }
    }
}