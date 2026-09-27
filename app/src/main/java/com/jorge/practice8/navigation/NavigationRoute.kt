package com.jorge.practice8.navigation

import kotlinx.serialization.Serializable

sealed interface NavigationRoute {

    @Serializable
    data object Home : NavigationRoute

}