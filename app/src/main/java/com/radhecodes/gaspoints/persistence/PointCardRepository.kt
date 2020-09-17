package com.radhecodes.gaspoints.persistence

import android.content.Context

import androidx.lifecycle.LiveData
import com.radhecodes.gaspoints.model.PointCard


class PointCardRepository(context: Context) {
    private val pointCardDatabase: PointCardDatabase = PointCardDatabase.getDatabase(context)

    suspend fun insertCardTask(pointCard: PointCard): Long {
      //  InsertAsyncTask(pointCardDatabase.pointCardDao()).execute(pointCard)
        return pointCardDatabase.pointCardDao().insertCard(pointCard)
    }

    suspend fun updateCardTask(pointCard: PointCard): Int {
        return pointCardDatabase.pointCardDao().updateCard(pointCard)
    }

    fun retrieveCardsTask(): LiveData<List<PointCard>> {
        return pointCardDatabase.pointCardDao().getAllCard()
    }

    fun retrieveCardByIdTask(id: Long): LiveData<PointCard> {
        return pointCardDatabase.pointCardDao().getCardView(id)
    }

    suspend fun deleteCardTask(pointCard: PointCard): Int {
        return pointCardDatabase.pointCardDao().deleteCard(pointCard)
    }
}