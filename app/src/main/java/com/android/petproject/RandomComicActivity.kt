package com.android.petproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.petproject.databinding.ActivityRandomComicBinding

class RandomComicActivity : AppCompatActivity() {

    private val binding: ActivityRandomComicBinding by lazy {ActivityRandomComicBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_comic)
    }
}