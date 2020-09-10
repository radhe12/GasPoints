package com.radhecodes.gaspoints;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0011H\u0002J\b\u0010 \u001a\u00020\u0018H\u0002J\b\u0010!\u001a\u00020\u0018H\u0002J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010#\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010%H\u0014R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/radhecodes/gaspoints/CardActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "currentMode", "", "Ljava/lang/Integer;", "editMode", "initialMode", "pointCard", "Lcom/radhecodes/gaspoints/model/PointCard;", "getPointCard", "()Lcom/radhecodes/gaspoints/model/PointCard;", "setPointCard", "(Lcom/radhecodes/gaspoints/model/PointCard;)V", "pointCardRepository", "Lcom/radhecodes/gaspoints/persistence/PointCardRepository;", "selectedPointCard", "", "getSelectedPointCard", "()Ljava/lang/String;", "setSelectedPointCard", "(Ljava/lang/String;)V", "viewMode", "cardViewSetup", "", "generateQRCode", "input", "getCardView", "id", "", "getColorCode", "cardType", "inEditMode", "inInitialMode", "inViewMode", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class CardActivity extends androidx.appcompat.app.AppCompatActivity {
    private final int initialMode = 0;
    private final int viewMode = 1;
    private final int editMode = 2;
    private java.lang.Integer currentMode;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String selectedPointCard;
    @org.jetbrains.annotations.NotNull()
    public com.radhecodes.gaspoints.model.PointCard pointCard;
    private com.radhecodes.gaspoints.persistence.PointCardRepository pointCardRepository;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedPointCard() {
        return null;
    }
    
    public final void setSelectedPointCard(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.radhecodes.gaspoints.model.PointCard getPointCard() {
        return null;
    }
    
    public final void setPointCard(@org.jetbrains.annotations.NotNull()
    com.radhecodes.gaspoints.model.PointCard p0) {
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
    
    private final void cardViewSetup(com.radhecodes.gaspoints.model.PointCard pointCard) {
    }
    
    private final int getColorCode(java.lang.String cardType) {
        return 0;
    }
    
    private final void generateQRCode(java.lang.String input) {
    }
    
    public CardActivity() {
        super();
    }
}