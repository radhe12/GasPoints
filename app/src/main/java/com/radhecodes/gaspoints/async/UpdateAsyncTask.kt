package com.radhecodes.gaspoints.async

import android.os.AsyncTask
import android.util.Log
import com.radhecodes.gaspoints.model.PointCard
import com.radhecodes.gaspoints.persistence.PointCardDao

class UpdateAsyncTask internal constructor(private val pointCardDao: PointCardDao,
                                           private val onTaskFinish: OnTaskFinish):
    AsyncTask<PointCard, Void, Int>() {
    
    override fun doInBackground(vararg p0: PointCard): Int? {
        Log.d(TAG, "doInBackground: thread" + Thread.currentThread().name)
        pointCardDao.updateCard(p0[0])
        return null
    }

    override fun onPostExecute(result: Int?) {
        onTaskFinish.onUpdateFinish()
    }

    companion object {
        private const val TAG = "UpdateAsyncTask"
    }
}