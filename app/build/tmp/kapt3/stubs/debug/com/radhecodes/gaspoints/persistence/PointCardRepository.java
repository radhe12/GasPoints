package com.radhecodes.gaspoints.persistence;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0010\u001a\u00020\fJ\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00120\u000fJ\u0010\u0010\u0013\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/radhecodes/gaspoints/persistence/PointCardRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "pointCardDatabase", "Lcom/radhecodes/gaspoints/persistence/PointCardDatabase;", "deleteCardTask", "", "pointCard", "Lcom/radhecodes/gaspoints/model/PointCard;", "insertCardTask", "", "(Lcom/radhecodes/gaspoints/model/PointCard;)Ljava/lang/Long;", "retrieveCardByIdTask", "Landroidx/lifecycle/LiveData;", "id", "retrieveCardsTask", "", "updateCardTask", "app_debug"})
public final class PointCardRepository {
    private final com.radhecodes.gaspoints.persistence.PointCardDatabase pointCardDatabase = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long insertCardTask(@org.jetbrains.annotations.Nullable()
    com.radhecodes.gaspoints.model.PointCard pointCard) {
        return null;
    }
    
    public final void updateCardTask(@org.jetbrains.annotations.Nullable()
    com.radhecodes.gaspoints.model.PointCard pointCard) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.radhecodes.gaspoints.model.PointCard>> retrieveCardsTask() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.radhecodes.gaspoints.model.PointCard> retrieveCardByIdTask(long id) {
        return null;
    }
    
    public final void deleteCardTask(@org.jetbrains.annotations.Nullable()
    com.radhecodes.gaspoints.model.PointCard pointCard) {
    }
    
    public PointCardRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}