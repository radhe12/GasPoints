package com.radhecodes.gaspoints.persistence

import android.content.Context

import androidx.lifecycle.LiveData
import com.radhecodes.gaspoints.async.DeleteAsyncTask
import com.radhecodes.gaspoints.async.InsertAsyncTask
import com.radhecodes.gaspoints.async.OnTaskFinish
import com.radhecodes.gaspoints.async.UpdateAsyncTask
import com.radhecodes.gaspoints.model.PointCard


class PointCardRepository(context: Context) {
    private val pointCardDatabase: PointCardDatabase = PointCardDatabase.getDatabase(context)

    fun insertCardTask(pointCard: PointCard?, onTaskFinish: OnTaskFinish) {
        InsertAsyncTask(pointCardDatabase.pointCardDao(), onTaskFinish).execute(pointCard)
    }

    fun updateCardTask(pointCard: PointCard?, onTaskFinish: OnTaskFinish) {
        UpdateAsyncTask(pointCardDatabase.pointCardDao(), onTaskFinish).execute(pointCard)
    }

    fun retrieveCardsTask(): LiveData<List<PointCard>> {
        return pointCardDatabase.pointCardDao().getAllCard()
    }

    fun retrieveCardByIdTask(id: Long): LiveData<PointCard> {
        return pointCardDatabase.pointCardDao().getCardView(id)
    }

    fun deleteCardTask(pointCard: PointCard?, onTaskFinish: OnTaskFinish) {
        DeleteAsyncTask(pointCardDatabase.pointCardDao(), onTaskFinish).execute(pointCard)
    }
}