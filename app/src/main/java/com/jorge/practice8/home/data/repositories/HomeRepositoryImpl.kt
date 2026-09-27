package com.jorge.practice8.home.data.repositories

import com.jorge.practice8.home.domain.models.User
import com.jorge.practice8.home.domain.repositories.HomeRepository

class HomeRepositoryImpl : HomeRepository {

    val users = listOf(
        User(1, "jorge", "Jorge Sanaguaray"),
        User(2, "juan", "Juan Perez"),
        User(3, "pedro", "Pedro Martinez"),
        User(4, "ana", "Ana Lopez"),
        User(5, "maria", "Maria Garcia"),
        User(6, "luis", "Luis Rodriguez"),
        User(7, "laura", "Laura Sanchez"),
        User(8, "carlos", "Carlos Hernandez"),
        User(9, "ana", "Ana Lopez"),
        User(10, "maria", "Maria Garcia"),
        User(11, "luis", "Luis Rodriguez"),
        User(12, "laura", "Laura Sanchez"),
        User(13, "carlos", "Carlos Hernandez"),
        User(14, "ana", "Ana Lopez"),
        User(15, "maria", "Maria Garcia"),
        User(16, "luis", "Luis Rodriguez"),
        User(17, "laura", "Laura Sanchez"),
        User(18, "carlos", "Carlos Hernandez"),
        User(19, "ana", "Ana Lopez"),
        User(20, "maria", "Maria Garcia")
    )

    override suspend fun showUsers(): List<User> {
        return users
    }

}