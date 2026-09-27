package com.jorge.practice8.home.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jorge.practice8.home.domain.usecases.ShowUsersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val showUsersUseCase: ShowUsersUseCase
) : ViewModel() {

    var state by mutableStateOf(HomeState())
        private set

    fun onEvent(event: HomeEvent) {

        when (event) {

            is HomeEvent.ShowUsers -> {

                viewModelScope.launch {

                    state = state.copy(
                        users = showUsersUseCase(),
                        isLoading = false
                    )

                }

            }

        }

    }

}