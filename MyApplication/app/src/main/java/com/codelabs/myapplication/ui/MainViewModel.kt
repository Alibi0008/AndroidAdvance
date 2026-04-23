package com.codelabs.myapplication.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codelabs.myapplication.domain.GetUserUseCase

class MainViewModel(
    private val getUserUseCase: GetUserUseCase
) : ViewModel() {
    val userName = MutableLiveData<String>()
    fun load() {
        userName.value = getUserUseCase.execute()
    }
}