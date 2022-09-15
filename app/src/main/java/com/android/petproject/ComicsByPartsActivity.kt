package com.android.petproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.petproject.databinding.ActivityComicsByPartsBinding

class ComicsByPartsActivity : AppCompatActivity() {

    private val binding: ActivityComicsByPartsBinding by lazy {
        ActivityComicsByPartsBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comics_by_parts)
    }
}