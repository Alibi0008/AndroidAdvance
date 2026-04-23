package com.codelabs.myapplication

import android.app.Application
import com.codelabs.myapplication.di.AppModule
import com.codelabs.myapplication.di.DaggerAppComponent

class MyApplication : Application() {

    // Компонент Dagger, будет сгенерирован: DaggerAppComponent
    lateinit var appComponent: com.codelabs.myapplication.di.AppComponent

    override fun onCreate() {
        super.onCreate()

        // Строим компонент и инжектим приложение (если в AppComponent есть inject(app))
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()

        appComponent.inject(this)
    }
}