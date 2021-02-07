package com.dzakyhdr.traindatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dzakyhdr.traindatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var mainViewModelFactory: MainViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainViewModelFactory = MainViewModelFactory(0)
        viewModel = ViewModelProvider(this, mainViewModelFactory).get(MainViewModel::class.java)
        viewModel.count.observe(this, {
            binding.txtNumber.text = it.toString()
        })

        binding.btnNumber.setOnClickListener {
            viewModel.countNumber()
        }

        binding.btnKurang.setOnClickListener {
            viewModel.decrement()
        }
    }

}