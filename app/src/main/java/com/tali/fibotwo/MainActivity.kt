package com.tali.fibotwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var fibonacciList: List<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fibonacciList = FibonacciGenerator.generateFibonacciNumbers()
        recyclerview.adapter = FibonacciAdapter(fibonacciList)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
