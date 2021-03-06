package com.radhecodes.gaspoints.persistence

import androidx.lifecycle.LiveData
import androidx.room.*
import com.radhecodes.gaspoints.model.PointCard

@Dao
interface PointCardDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertCard(pointCard: PointCard): Long

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateCard(pointCard: PointCard): Int

    @Delete
    suspend fun deleteCard(pointCard: PointCard): Int

    @Query("SELECT * FROM pointcards")
    fun getAllCard() : LiveData<List<PointCard>>

    @Query("SELECT * FROM pointcards WHERE id = :id")
    fun getCardView(id: Long): LiveData<PointCard>


}