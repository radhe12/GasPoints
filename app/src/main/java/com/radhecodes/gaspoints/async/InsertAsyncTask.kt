package com.radhecodes.gaspoints.async

import android.os.AsyncTask
import android.util.Log
import com.radhecodes.gaspoints.model.PointCard
import com.radhecodes.gaspoints.persistence.PointCardDao

class InsertAsyncTask internal constructor(private val pointCardDao: PointCardDao,
                                           private val onTaskFinish: OnTaskFinish):
    AsyncTask<PointCard, Void, Long>() {
    
    override fun doInBackground(vararg p0: PointCard): Long? {
        Log.d(TAG, "doInBackground: thread" + Thread.currentThread().name)
        return pointCardDao.insertCard(p0[0])
    }

    override fun onPostExecute(result: Long?) {
        onTaskFinish.onInsertFinish(result)
    }

    companion object {
        private const val TAG = "InsertAsyncTask"
    }
}

interface OnTaskFinish{
    fun onInsertFinish(result: Long?)
    fun onUpdateFinish()
    fun onDeleteSuccess()
}
