package com.jorge.practice8.home.presentation

sealed interface HomeEvent {

    data object ShowUsers : HomeEvent

}