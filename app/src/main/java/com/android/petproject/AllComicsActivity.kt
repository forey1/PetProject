package com.android.petproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.petproject.databinding.ActivityAllComicsBinding

class AllComicsActivity : AppCompatActivity() {

    private val binding: ActivityAllComicsBinding by lazy {
        ActivityAllComicsBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_comics)
    }
}