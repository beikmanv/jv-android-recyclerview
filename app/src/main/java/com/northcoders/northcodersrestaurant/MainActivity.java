package com.northcoders.northcodersrestaurant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.northcoders.northcodersrestaurant.model.FoodItem;
import com.nothcoders.northcodersrestaurant.R;
import com.nothcoders.northcodersrestaurant.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FoodItemAdapter foodItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Set up RecyclerView
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Get the food item list from the data source
        foodItemAdapter = new FoodItemAdapter(FoodItemDataSource.getFoodItems());

        // Set the adapter
        binding.recyclerView.setAdapter(foodItemAdapter);
    }
}