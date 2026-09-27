package com.jorge.practice8.home.domain.usecases

import com.jorge.practice8.home.domain.models.User
import com.jorge.practice8.home.domain.repositories.HomeRepository

class ShowUsersUseCase(
    private val repository: HomeRepository
) {

    suspend operator fun invoke(): List<User> {
        return repository.showUsers()
    }

}