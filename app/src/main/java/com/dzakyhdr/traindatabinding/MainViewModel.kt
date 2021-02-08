package com.dzakyhdr.traindatabinding

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(startCount: Int) : ViewModel() {
    private var _count = MutableLiveData<Int>()
    val count: LiveData<Int>
        get() = _count

    val inputText = MutableLiveData<String>()

    init {
        _count.value = startCount
    }

    fun sumNumber() {
        val inputText: Int = inputText.value!!.toInt()
        _count.value = (_count.value)?.plus(inputText)
    }

    fun clearValue(){
        _count.value = (_count.value)?.times(0)
    }
}