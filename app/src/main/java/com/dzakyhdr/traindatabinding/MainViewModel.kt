package com.dzakyhdr.traindatabinding

import androidx.lifecycle.ViewModel

class MainViewModel(private var startCount: Int) : ViewModel() {

    fun currentNumber(): Int {
        return startCount
    }

    fun sumNumber(input: Int): Int {
        startCount += input
        return startCount
    }
}