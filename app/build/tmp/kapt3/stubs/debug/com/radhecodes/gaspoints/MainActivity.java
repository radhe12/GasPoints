package com.radhecodes.gaspoints;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/radhecodes/gaspoints/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/radhecodes/gaspoints/adapter/CardsRecyclerAdapter$OnPointCardListener;", "()V", "cardAdapter", "Lcom/radhecodes/gaspoints/adapter/CardsRecyclerAdapter;", "pointCardRepository", "Lcom/radhecodes/gaspoints/persistence/PointCardRepository;", "pointCards", "Ljava/util/ArrayList;", "Lcom/radhecodes/gaspoints/model/PointCard;", "Lkotlin/collections/ArrayList;", "getAllPointsCard", "", "initRecyclerView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPointCardClick", "position", "", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.radhecodes.gaspoints.adapter.CardsRecyclerAdapter.OnPointCardListener {
    private com.radhecodes.gaspoints.adapter.CardsRecyclerAdapter cardAdapter;
    private com.radhecodes.gaspoints.persistence.PointCardRepository pointCardRepository;
    private java.util.ArrayList<com.radhecodes.gaspoints.model.PointCard> pointCards;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRecyclerView() {
    }
    
    private final void getAllPointsCard() {
    }
    
    @java.lang.Override()
    public void onPointCardClick(int position) {
    }
    
    public MainActivity() {
        super();
    }
}