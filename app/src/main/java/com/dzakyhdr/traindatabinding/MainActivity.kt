package com.dzakyhdr.traindatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

        binding.txtResult.text = viewModel.currentNumber().toString()

        binding.btnSum.setOnClickListener{
        val input = binding.edtNumber.text.toString()
            if (input.isEmpty()){
                Toast.makeText(this, "Tidak Boleh Kosong", Toast.LENGTH_SHORT).show()
            }else{
                binding.txtResult.text = viewModel.sumNumber(input.toInt()).toString()
            }

    }
}

}