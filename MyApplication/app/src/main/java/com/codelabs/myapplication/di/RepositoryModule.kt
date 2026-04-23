package com.codelabs.myapplication.di

import com.codelabs.myapplication.data.repository.UserRepositoryImpl
import com.codelabs.myapplication.data.source.FakeUserDataSource
import com.codelabs.myapplication.data.source.UserDataSource
import com.codelabs.myapplication.domain.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class RepositoryModule {

    @Binds
    abstract fun bindUserRepository(impl: UserRepositoryImpl): UserRepository

    companion object {
        @Provides
        @Singleton
        fun provideUserDataSource(): UserDataSource = FakeUserDataSource()
    }
}