package com.jorge.practice8.home.domain.repositories

import com.jorge.practice8.home.domain.models.User

interface HomeRepository {

    suspend fun showUsers(): List<User>

}