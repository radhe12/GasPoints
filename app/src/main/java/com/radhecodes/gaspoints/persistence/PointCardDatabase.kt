package com.radhecodes.gaspoints.persistence

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.radhecodes.gaspoints.model.PointCard

@Database(entities = [PointCard::class], version = 1, exportSchema = true)
abstract class PointCardDatabase: RoomDatabase() {
    abstract fun pointCardDao(): PointCardDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: PointCardDatabase? = null

        fun getDatabase(context: Context): PointCardDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PointCardDatabase::class.java,
                    "point_card_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}