package com.codelabs.myapplication.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.codelabs.myapplication.MyApplication
import com.codelabs.myapplication.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MyApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Перед использованием ensure viewModelFactory инжектирован
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)

        val tv = findViewById<TextView>(R.id.tvName)
        viewModel.userName.observe(this) { tv.text = it }
        viewModel.load()
    }
}