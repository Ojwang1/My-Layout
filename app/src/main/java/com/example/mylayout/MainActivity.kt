package com.example.mylayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView = findViewById<ListView>(R.id.ListView)
        val Nicholas = arrayOf("Mango", "Apple", "Banana", "Lemon", "Berry", "Tomato")
        val arrayAdapter: ArrayAdapter<String> =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, Nicholas)
        listView.adapter = arrayAdapter
        listView.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(this, "I love you" + Nicholas[position], Toast.LENGTH_SHORT).show()
        }
    }
}