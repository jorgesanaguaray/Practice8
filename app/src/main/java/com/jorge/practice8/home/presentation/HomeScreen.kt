package com.jorge.practice8.home.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import com.jorge.practice8.home.presentation.components.HomeUsers

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel()
) {

    val state = viewModel.state

    HomeUsers(modifier = modifier, state = state, onEvent = viewModel::onEvent)

}