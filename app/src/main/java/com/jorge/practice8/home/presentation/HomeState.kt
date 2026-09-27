package com.jorge.practice8.home.presentation

import com.jorge.practice8.home.domain.models.User

data class HomeState(

    val users: List<User> = emptyList(),
    val isLoading: Boolean = true

)