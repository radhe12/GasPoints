package com.radhecodes.gaspoints.async;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0012B\u0017\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ#\u0010\n\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\f\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0014\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/radhecodes/gaspoints/async/InsertAsyncTask;", "Landroid/os/AsyncTask;", "Lcom/radhecodes/gaspoints/model/PointCard;", "Ljava/lang/Void;", "", "pointCardDao", "Lcom/radhecodes/gaspoints/persistence/PointCardDao;", "onTaskFinish", "Lcom/radhecodes/gaspoints/async/OnTaskFinish;", "(Lcom/radhecodes/gaspoints/persistence/PointCardDao;Lcom/radhecodes/gaspoints/async/OnTaskFinish;)V", "doInBackground", "p0", "", "([Lcom/radhecodes/gaspoints/model/PointCard;)Ljava/lang/Long;", "onPostExecute", "", "result", "(Ljava/lang/Long;)V", "Companion", "app_debug"})
public final class InsertAsyncTask extends android.os.AsyncTask<com.radhecodes.gaspoints.model.PointCard, java.lang.Void, java.lang.Long> {
    private final com.radhecodes.gaspoints.persistence.PointCardDao pointCardDao = null;
    private final com.radhecodes.gaspoints.async.OnTaskFinish onTaskFinish = null;
    private static final java.lang.String TAG = "InsertAsyncTask";
    public static final com.radhecodes.gaspoints.async.InsertAsyncTask.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Long doInBackground(@org.jetbrains.annotations.NotNull()
    com.radhecodes.gaspoints.model.PointCard... p0) {
        return null;
    }
    
    @java.lang.Override()
    protected void onPostExecute(@org.jetbrains.annotations.Nullable()
    java.lang.Long result) {
    }
    
    public InsertAsyncTask(@org.jetbrains.annotations.NotNull()
    com.radhecodes.gaspoints.persistence.PointCardDao pointCardDao, @org.jetbrains.annotations.NotNull()
    com.radhecodes.gaspoints.async.OnTaskFinish onTaskFinish) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/radhecodes/gaspoints/async/InsertAsyncTask$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}