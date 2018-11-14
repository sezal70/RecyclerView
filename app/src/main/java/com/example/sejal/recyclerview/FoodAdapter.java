package com.example.sejal.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Sejal on 4/30/2017.
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodViewHolder> {

    Context context;
    ArrayList<Food> foodList;
    OnFoodListener onFoodListener;

    public FoodAdapter(Context context , ArrayList<Food> foodlist){
        this.context = context;
        this.foodList = foodlist;

    }
    @Override
    public FoodViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_food,null);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FoodViewHolder holder, final int position) {
        final Food food = foodList.get(position);
        holder.txtName.setText(food.getName());
        holder.txtPrice.setText(String.valueOf(food.getPrice()));
        holder.imgIcon.setImageResource(food.getIcon());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFoodListener.onFoodClick(food,position);
            }
        });


    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public void setOnFoodClickListener(OnFoodListener onFoodListener){
        this.onFoodListener=onFoodListener;

    }
}
