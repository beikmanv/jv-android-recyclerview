package com.nothcoders.northcodersrestaurant;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.nothcoders.northcodersrestaurant.databinding.FoodItemLayoutBinding;
import com.nothcoders.northcodersrestaurant.model.FoodItem;

import java.util.List;

public class FoodItemAdapter extends RecyclerView.Adapter<FoodItemAdapter.FoodItemViewHolder> {
    private List<FoodItem> foodItemList;

    public FoodItemAdapter(List<FoodItem> foodItemList) {
        this.foodItemList = foodItemList;
    }

    @NonNull
    @Override
    public FoodItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        FoodItemLayoutBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.food_item_layout,
                parent,
                false
        );
        return new FoodItemViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodItemViewHolder holder, int position) {
        FoodItem foodItem = foodItemList.get(position);
        holder.binding.setFoodItem(foodItem);
    }

    @Override
    public int getItemCount() {
        return foodItemList.size();
    }

    public static class FoodItemViewHolder extends RecyclerView.ViewHolder{
        private FoodItemLayoutBinding binding;

        public FoodItemViewHolder(FoodItemLayoutBinding foodItemLayoutBinding) {
            super(foodItemLayoutBinding.getRoot());
            this.binding = foodItemLayoutBinding;
        }
    }

}
