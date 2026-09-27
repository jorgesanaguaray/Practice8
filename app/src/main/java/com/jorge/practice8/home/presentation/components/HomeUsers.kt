package com.jorge.practice8.home.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.jorge.practice8.home.domain.models.User
import com.jorge.practice8.home.presentation.HomeEvent
import com.jorge.practice8.home.presentation.HomeState

@Composable
fun HomeUsers(
    modifier: Modifier = Modifier,
    state: HomeState,
    onEvent: (HomeEvent) -> Unit
) {

    LazyColumn(modifier = modifier) {

        item { HomeHeader() }

        item { HomeButton(modifier = modifier.fillMaxWidth()) { onEvent(HomeEvent.ShowUsers) } }

        items(state.users) { user ->
            HomeUserItem(user = user)
        }

        item { HomeFooter() }

    }

}

@Composable
fun HomeUserItem(
    modifier: Modifier = Modifier,
    user: User
) {

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(12.dp)
    ) {
        Text(text = user.username, fontWeight = FontWeight.Bold)
        Text(text = user.name)
    }

}