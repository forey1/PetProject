package com.android.petproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.petproject.databinding.ActivityAllCharactersBinding

class AllCharactersActivity : AppCompatActivity() {

    private val binding: ActivityAllCharactersBinding by lazy {
        ActivityAllCharactersBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_characters)
    }
}