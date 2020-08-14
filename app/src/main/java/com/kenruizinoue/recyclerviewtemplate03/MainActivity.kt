package com.kenruizinoue.recyclerviewtemplate03

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myAdapter = MyAdapter(listOf("Test1", "Test2", "Test3"))
        myRecyclerView.apply {
            adapter = myAdapter
        }
    }
}