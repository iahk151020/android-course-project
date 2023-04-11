package com.example.courseproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

    private List<Pizza> pizzaList;
    private Context context;

    public MenuAdapter(Context context, List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
        this.context = context;
    }

    @NonNull
    @Override
    public MenuAdapter.MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_item,parent,false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.MenuViewHolder holder, int position) {
        Pizza pizza = pizzaList.get(position);
        if (pizza == null) {
            return;
        }

        holder.tvItemName.setText(pizza.getName());
        holder.ratingBar.setRating(pizza.getRating());
        holder.itemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent in = new Intent()
            }
        });
    }

    @Override
    public int getItemCount() {
        return pizzaList != null  ? pizzaList.size() : 0;
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder {

        TextView tvItemName;
        RatingBar ratingBar;
        ConstraintLayout itemLayout;
        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            tvItemName = itemView.findViewById(R.id.tv_itemName);
            ratingBar = itemView.findViewById(R.id.rb_item);
            itemLayout = itemView.findViewById(R.id.itemLayout);
            ratingBar.setEnabled(false);
        }
    }
}
