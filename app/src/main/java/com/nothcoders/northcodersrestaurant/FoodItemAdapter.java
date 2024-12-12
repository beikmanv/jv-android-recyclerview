package com.nothcoders.northcodersrestaurant;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nothcoders.northcodersrestaurant.databinding.FoodItemLayoutBinding;
import com.nothcoders.northcodersrestaurant.model.FoodItem;

import java.util.List;

public class FoodItemAdapter extends RecyclerView.Adapter<FoodItemAdapter.FoodItemViewHolder> {
    private List<FoodItem> foodItemList;
    public static class FoodItemViewHolder extends RecyclerView.ViewHolder{
        private FoodItemLayoutBinding foodItemLayoutBinding;

        public FoodItemViewHolder(@NonNull View itemView, FoodItemLayoutBinding foodItemLayoutBinding) {
            super(itemView);
            this.foodItemLayoutBinding = foodItemLayoutBinding;
        }
    }
}
