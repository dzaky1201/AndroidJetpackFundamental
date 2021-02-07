package com.dzakyhdr.traindatabinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(startCount: Int) : ViewModel() {
    private var _count = MutableLiveData<Int>()
    val count: LiveData<Int>
        get() = _count

    init {
        _count.value = startCount
    }

    fun sumNumber(input: Int) {
        _count.value = (_count.value)?.plus(input)
    }
}