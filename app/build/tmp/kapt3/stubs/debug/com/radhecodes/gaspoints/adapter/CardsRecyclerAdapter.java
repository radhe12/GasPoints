package com.radhecodes.gaspoints.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/radhecodes/gaspoints/adapter/CardsRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/radhecodes/gaspoints/adapter/CardsRecyclerAdapter$CardViewHolder;", "onPointCardListener", "Lcom/radhecodes/gaspoints/adapter/CardsRecyclerAdapter$OnPointCardListener;", "(Lcom/radhecodes/gaspoints/adapter/CardsRecyclerAdapter$OnPointCardListener;)V", "items", "", "Lcom/radhecodes/gaspoints/model/PointCard;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "cards", "CardViewHolder", "OnPointCardListener", "app_debug"})
public final class CardsRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.radhecodes.gaspoints.adapter.CardsRecyclerAdapter.CardViewHolder> {
    private java.util.List<com.radhecodes.gaspoints.model.PointCard> items;
    private final com.radhecodes.gaspoints.adapter.CardsRecyclerAdapter.OnPointCardListener onPointCardListener = null;
    
    public final void submitList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.radhecodes.gaspoints.model.PointCard> cards) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.radhecodes.gaspoints.adapter.CardsRecyclerAdapter.CardViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.radhecodes.gaspoints.adapter.CardsRecyclerAdapter.CardViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public CardsRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    com.radhecodes.gaspoints.adapter.CardsRecyclerAdapter.OnPointCardListener onPointCardListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J\u0012\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0016R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/radhecodes/gaspoints/adapter/CardsRecyclerAdapter$CardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "onPointCardListener", "Lcom/radhecodes/gaspoints/adapter/CardsRecyclerAdapter$OnPointCardListener;", "(Landroid/view/View;Lcom/radhecodes/gaspoints/adapter/CardsRecyclerAdapter$OnPointCardListener;)V", "cardName", "Landroidx/appcompat/widget/AppCompatTextView;", "kotlin.jvm.PlatformType", "cardView", "Landroidx/cardview/widget/CardView;", "bind", "", "pointCard", "Lcom/radhecodes/gaspoints/model/PointCard;", "getColorCode", "", "cardType", "", "view", "onClick", "v", "app_debug"})
    public static final class CardViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        private final androidx.appcompat.widget.AppCompatTextView cardName = null;
        private final androidx.cardview.widget.CardView cardView = null;
        private final com.radhecodes.gaspoints.adapter.CardsRecyclerAdapter.OnPointCardListener onPointCardListener = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.radhecodes.gaspoints.model.PointCard pointCard) {
        }
        
        private final int getColorCode(java.lang.String cardType, android.view.View view) {
            return 0;
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
        
        public CardViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        com.radhecodes.gaspoints.adapter.CardsRecyclerAdapter.OnPointCardListener onPointCardListener) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/radhecodes/gaspoints/adapter/CardsRecyclerAdapter$OnPointCardListener;", "", "onPointCardClick", "", "position", "", "app_debug"})
    public static abstract interface OnPointCardListener {
        
        public abstract void onPointCardClick(int position);
    }
}