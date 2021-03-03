package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<Model>()

        list.add(Model(R.drawable.img3,"Ice Cream Sundae","GIP Mall,Noida",
            5,"520 reviews","Rs 180","02 Mar 2021 11:30AM"))
        list.add(Model(R.drawable.img3,"Ice Cream Sundae","GIP Mall,Noida",
            5,"520 reviews","Rs 180","02 Mar 2021 11:30AM"))
        list.add(Model(R.drawable.img3,"Ice Cream Sundae","GIP Mall,Noida",
            5,"520 reviews","Rs 180","02 Mar 2021 11:30AM"))
        list.add(Model(R.drawable.img3,"Ice Cream Sundae","GIP Mall,Noida",
            5,"520 reviews","Rs 180","02 Mar 2021 11:30AM"))
        list.add(Model(R.drawable.img3,"Ice Cream Sundae","GIP Mall,Noida",
            5,"520 reviews","Rs 180","02 Mar 2021 11:30AM"))
        list.add(Model(R.drawable.img3,"Ice Cream Sundae","GIP Mall,Noida",
            5,"520 reviews","Rs 180","02 Mar 2021 11:30AM"))
        list.add(Model(R.drawable.img3,"Ice Cream Sundae","GIP Mall,Noida",
            5,"520 reviews","Rs 180","02 Mar 2021 11:30AM"))
        list.add(Model(R.drawable.img3,"Ice Cream Sundae","GIP Mall,Noida",
            5,"520 reviews","Rs 180","02 Mar 2021 11:30AM"))
        val recyclerView=findViewById<RecyclerView>(R.id.r_v)
        recyclerView.adapter=MyCustomAdapter(list)
        recyclerView.layoutManager=
            LinearLayoutManager(this,RecyclerView.VERTICAL,false)
    }
}