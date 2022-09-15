package com.android.petproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.petproject.databinding.ActivityComicsByCenturyBinding

class ComicsByCenturyActivity : AppCompatActivity() {

    private val binding: ActivityComicsByCenturyBinding by lazy { ActivityComicsByCenturyBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comics_by_century)
    }
}