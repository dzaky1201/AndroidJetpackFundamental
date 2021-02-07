package com.dzakyhdr.traindatabinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(number: Int) : ViewModel() {
    private var _count = MutableLiveData<Int>()
    val count: LiveData<Int>
        get() = _count
    init {
        _count.value = number
    }
    fun countNumber() {
        _count.value?.let {
            _count.value = it + 1
        }
    }

    fun decrement(){
        _count.value?.let {
            _count.value = it - 1
        }
    }

}