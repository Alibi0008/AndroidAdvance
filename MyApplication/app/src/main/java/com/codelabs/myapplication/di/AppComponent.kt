package com.codelabs.myapplication.di

import com.codelabs.myapplication.MyApplication
import com.codelabs.myapplication.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, RepositoryModule::class])
interface AppComponent {
    fun inject(app: MyApplication)
    fun inject(activity: MainActivity)
}