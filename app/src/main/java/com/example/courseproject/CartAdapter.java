package com.example.courseproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {

    Context context;
    List<Item> itemList;


    private void initData() {
        itemList = new ArrayList<Item>();
        Item item1 = new Item("", "pizza 1", "2", "M", "15" );
        Item item2 = new Item("", "pizza 2", "1", "L", "16" );
        itemList.add(item1);
        itemList.add(item2);
    }

    public CartAdapter (Context context){
        this.context = context;
        initData();
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item,parent,false);
        return new CartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
        Item item = itemList.get(position);
        if (item == null) return;

        holder.tvCartItemName.setText(item.getName());
        holder.tvCartItemPrice.setText("Price: " + item.getPrice());
        holder.tvCartItemQuantity.setText("Quantity: " + item.getQuantity());
        holder.tvCartItemSize.setText("Size: " + item.getSize());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class CartViewHolder extends RecyclerView.ViewHolder {

        ConstraintLayout clCartItem;
        ImageView ivCartItem;
        TextView tvCartItemName, tvCartItemPrice, tvCartItemQuantity, tvCartItemSize;

        public CartViewHolder(@NonNull View itemView) {
            super(itemView);
            clCartItem = itemView.findViewById(R.id.cl_cart_item);
            tvCartItemName = itemView.findViewById(R.id.tv_cart_item_name);
            tvCartItemSize = itemView.findViewById(R.id.tv_cart_item_size);
            tvCartItemQuantity = itemView.findViewById(R.id.tv_cart_item_quantity);
            tvCartItemPrice = itemView.findViewById(R.id.tv_cart_item_price);
        }
    }

}
