package com.radhecodes.gaspoints.async

import android.os.AsyncTask
import android.util.Log
import com.radhecodes.gaspoints.model.PointCard
import com.radhecodes.gaspoints.persistence.PointCardDao

class DeleteAsyncTask internal constructor(private val pointCardDao: PointCardDao, private val onTaskFinish: OnTaskFinish):
    AsyncTask<PointCard, Void, Void>() {
    
    override fun doInBackground(vararg p0: PointCard): Void? {
        Log.d(TAG, "doInBackground: thread" + Thread.currentThread().name)
        pointCardDao.deleteCard(p0[0])
        return null
    }

    override fun onPostExecute(result: Void?) {
        onTaskFinish.onDeleteSuccess()
    }

    companion object {
        private const val TAG = "DeleteAsyncTask"
    }
}