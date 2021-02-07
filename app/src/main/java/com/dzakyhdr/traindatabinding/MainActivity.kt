package com.dzakyhdr.traindatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dzakyhdr.traindatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.student = getStudent()
    }

    private fun getStudent(): Student {
        return Student(1,"Dzaky", "dzakyhdr@gmail.com")
    }
}