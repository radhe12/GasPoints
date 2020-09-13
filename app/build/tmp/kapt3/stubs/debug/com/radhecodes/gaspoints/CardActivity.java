package com.radhecodes.gaspoints;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0014H\u0002J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0014H\u0002J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u000eH\u0002J\b\u0010!\u001a\u00020\u0017H\u0002J\b\u0010\"\u001a\u00020\u0017H\u0002J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0014H\u0002J\u0017\u0010$\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u0014H\u0002\u00a2\u0006\u0002\u0010%J\u0012\u0010&\u001a\u00020\u00172\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020\u0017H\u0016J\u0017\u0010*\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u0014H\u0016\u00a2\u0006\u0002\u0010%J\b\u0010+\u001a\u00020\u0017H\u0016R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/radhecodes/gaspoints/CardActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/radhecodes/gaspoints/async/OnTaskFinish;", "()V", "currentMode", "", "Ljava/lang/Integer;", "editMode", "initialMode", "initialPointCard", "Lcom/radhecodes/gaspoints/model/PointCard;", "pointCardRepository", "Lcom/radhecodes/gaspoints/persistence/PointCardRepository;", "selectedPointCard", "", "getSelectedPointCard", "()Ljava/lang/String;", "setSelectedPointCard", "(Ljava/lang/String;)V", "selectedPointCardId", "", "viewMode", "cardEditModeSetup", "", "pointCard", "cardViewSetup", "generateQRCode", "input", "getCardInEditView", "id", "getCardView", "getColorCode", "cardType", "inEditMode", "inInitialMode", "inViewMode", "insertSuccess", "(Ljava/lang/Long;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteSuccess", "onInsertFinish", "onUpdateFinish", "app_debug"})
public final class CardActivity extends androidx.appcompat.app.AppCompatActivity implements com.radhecodes.gaspoints.async.OnTaskFinish {
    private final int initialMode = 0;
    private final int viewMode = 1;
    private final int editMode = 2;
    private java.lang.Integer currentMode;
    private com.radhecodes.gaspoints.model.PointCard initialPointCard;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String selectedPointCard;
    private long selectedPointCardId = 0L;
    private com.radhecodes.gaspoints.persistence.PointCardRepository pointCardRepository;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedPointCard() {
        return null;
    }
    
    public final void setSelectedPointCard(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void inInitialMode() {
    }
    
    private final void inViewMode(long id) {
    }
    
    private final void inEditMode() {
    }
    
    private final void getCardView(long id) {
    }
    
    private final void getCardInEditView(long id) {
    }
    
    private final void cardEditModeSetup(com.radhecodes.gaspoints.model.PointCard pointCard) {
    }
    
    private final void cardViewSetup(com.radhecodes.gaspoints.model.PointCard pointCard) {
    }
    
    private final int getColorCode(java.lang.String cardType) {
        return 0;
    }
    
    private final void generateQRCode(java.lang.String input) {
    }
    
    @java.lang.Override()
    public void onInsertFinish(@org.jetbrains.annotations.Nullable()
    java.lang.Long id) {
    }
    
    @java.lang.Override()
    public void onUpdateFinish() {
    }
    
    @java.lang.Override()
    public void onDeleteSuccess() {
    }
    
    private final void insertSuccess(java.lang.Long id) {
    }
    
    public CardActivity() {
        super();
    }
}