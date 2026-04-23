package com.codelabs.myapplication.data.repository

import com.codelabs.myapplication.data.source.UserDataSource
import com.codelabs.myapplication.domain.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val dataSource: UserDataSource
) : UserRepository {
    override fun getUserName(): String = dataSource.getUserName()
}