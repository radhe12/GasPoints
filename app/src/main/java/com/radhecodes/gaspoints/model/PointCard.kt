package com.radhecodes.gaspoints.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pointcards")
data class PointCard(
    @ColumnInfo(name = "pointscardtype") var pointCardType:String,
    @ColumnInfo(name = "barcodedata") var barcodeData: String
) {
    @PrimaryKey(autoGenerate = true) var id: Long = 0
}