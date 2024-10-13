package com.example.bindingadapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bindingadapters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        val data = DataModel (
            "MoMo",
            "Android Developer",
            "https://cdn.pixabay.com/photo/2017/06/13/12/53/profile-2398782_1280.png",
            12)

        binding.dataModel = data
    }
}