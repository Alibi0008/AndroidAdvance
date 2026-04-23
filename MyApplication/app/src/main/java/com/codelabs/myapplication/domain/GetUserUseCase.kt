package com.codelabs.myapplication.domain

import com.codelabs.myapplication.domain.repository.UserRepository
import javax.inject.Inject

class GetUserUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    fun execute(): String = userRepository.getUserName()
}