package com.example.mywishlistapp

import android.app.Application

class wishListApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this)
    }
}