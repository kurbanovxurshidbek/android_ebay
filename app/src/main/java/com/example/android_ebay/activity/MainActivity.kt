package com.example.android_ebay.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_ebay.R
import com.example.android_ebay.adapter.FavoriteAdapter
import com.example.android_ebay.model.Favorite

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        val manager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.setLayoutManager(manager)

        refreshAdapter(getFavorites())
    }

    fun refreshAdapter(items: ArrayList<Favorite>) {
        val adapter = FavoriteAdapter(this, items)
        recyclerView.adapter = adapter
    }

    fun getFavorites(): ArrayList<Favorite> {
        val items = ArrayList<Favorite>()
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))

        return items
    }
}