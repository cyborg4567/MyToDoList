package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String =" "
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Iphone 15", description = "Best Flagship Phone"),
        Wish(title = "MacBook M2" ,  description = " A really powerful laptop for coding"),
        Wish(title = "Royal Enfield Himalayan", description = "My dream bike"),
        Wish(title = "A good Suv", description = "A powerful car that is 7 seater")
    )
}