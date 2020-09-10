package com.radhecodes.gaspoints.persistence

import android.content.Context

import androidx.lifecycle.LiveData
import com.radhecodes.gaspoints.async.InsertAsyncTask
import com.radhecodes.gaspoints.model.PointCard


class PointCardRepository(context: Context) {
    private val pointCardDatabase: PointCardDatabase = PointCardDatabase.getDatabase(context)

    fun insertCardTask(pointCard: PointCard?) : Long? {
        InsertAsyncTask(pointCardDatabase.pointCardDao()).execute(pointCard)
        return pointCard?.id

    }

    fun updateCardTask(pointCard: PointCard?) {}

    fun retrieveCardsTask(): LiveData<List<PointCard>> {
        return pointCardDatabase.pointCardDao().getAllCard()
    }

    fun retrieveCardByIdTask(id: Long): LiveData<PointCard> {
        return pointCardDatabase.pointCardDao().getCardView(id)
    }

    fun deleteCardTask(pointCard: PointCard?) {}

}