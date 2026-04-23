package com.codelabs.myapplication.data.source

import javax.inject.Inject

interface UserDataSource {
    fun getUserName(): String
}

class FakeUserDataSource @Inject constructor() : UserDataSource {
    override fun getUserName(): String = "Alibi - kbtuwnik"
}