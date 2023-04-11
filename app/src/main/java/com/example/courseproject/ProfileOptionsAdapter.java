package com.example.courseproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProfileOptionsAdapter extends RecyclerView.Adapter<ProfileOptionsAdapter.ProfileOptionViewHolder> {

    private List<String> optionList;
    private Context context;

    public ProfileOptionsAdapter (Context context) {
        this.context =  context;
        optionList = new ArrayList<>();
        optionList.add("Cart");
        optionList.add("Order history");
        optionList.add("Edit profile");
        optionList.add("Change password");
        optionList.add("Log out");
    }

    @NonNull
    @Override
    public ProfileOptionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_option,parent,false);
        return new ProfileOptionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileOptionViewHolder holder, int position) {
        holder.tvProfileOption.setText(optionList.get(position));
        holder.clProfileOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    @Override
    public int getItemCount() {
        return optionList.size();
    }

    public class ProfileOptionViewHolder extends RecyclerView.ViewHolder {

        TextView tvProfileOption;
        ConstraintLayout clProfileOption;

        public ProfileOptionViewHolder(@NonNull View itemView) {
            super(itemView);
            tvProfileOption = itemView.findViewById(R.id.tv_profile_option);
            clProfileOption = itemView.findViewById(R.id.cl_profile_option);
        }
    }
}
