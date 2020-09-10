package com.radhecodes.gaspoints.persistence;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/radhecodes/gaspoints/persistence/PointCardDao;", "", "deleteCard", "", "pointCard", "Lcom/radhecodes/gaspoints/model/PointCard;", "getAllCard", "Landroidx/lifecycle/LiveData;", "", "getCardView", "id", "", "insertCard", "updateCard", "app_debug"})
public abstract interface PointCardDao {
    
    @androidx.room.Insert()
    public abstract long insertCard(@org.jetbrains.annotations.NotNull()
    com.radhecodes.gaspoints.model.PointCard pointCard);
    
    @androidx.room.Update()
    public abstract int updateCard(@org.jetbrains.annotations.NotNull()
    com.radhecodes.gaspoints.model.PointCard pointCard);
    
    @androidx.room.Delete()
    public abstract int deleteCard(@org.jetbrains.annotations.NotNull()
    com.radhecodes.gaspoints.model.PointCard pointCard);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM pointcards")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.radhecodes.gaspoints.model.PointCard>> getAllCard();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM pointcards WHERE id = :id")
    public abstract androidx.lifecycle.LiveData<com.radhecodes.gaspoints.model.PointCard> getCardView(long id);
}