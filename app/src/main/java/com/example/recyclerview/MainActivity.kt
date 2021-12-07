package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapters.CustomAdapter

class MainActivity : AppCompatActivity() {

    val array = arrayListOf("Askhat","Ainura","Aidana","Atai","Bakai")
    val pictures = arrayListOf(
        Pictures("place1", R.drawable.place1),
        Pictures("place2", R.drawable.place2),
        Pictures("place3", R.drawable.place3),
        Pictures("place4", R.drawable.place4),
        Pictures("place5", R.drawable.place5))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter(pictures)
    }


}
