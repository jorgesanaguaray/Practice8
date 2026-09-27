package com.jorge.practice8.home.di

import com.jorge.practice8.home.data.repositories.HomeRepositoryImpl
import com.jorge.practice8.home.domain.repositories.HomeRepository
import com.jorge.practice8.home.domain.usecases.ShowUsersUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HomeModule {

    @Provides
    @Singleton
    fun provideHomeRepository(): HomeRepository {
        return HomeRepositoryImpl()
    }

    @Provides
    @Singleton
    fun provideShowUsersUseCase(repository: HomeRepository): ShowUsersUseCase {
        return ShowUsersUseCase(repository)
    }

}