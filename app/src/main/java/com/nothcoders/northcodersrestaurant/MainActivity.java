package com.nothcoders.northcodersrestaurant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nothcoders.northcodersrestaurant.databinding.ActivityMainBinding;
import com.nothcoders.northcodersrestaurant.model.FoodItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<FoodItem> foodItemList;
    private FoodItemAdapter foodItemAdapter;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        recyclerView = binding.recyclerView;

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        foodItemList = new ArrayList<>();

        FoodItem burger = new FoodItem(
                R.drawable.burger,
                "Burger",
                "Our burgers are made with 100% Aberdeen Angus beef, " +
                        "char-grilled to perfection, and served with " +
                        "our in-house relish on a brioche bun",
                10.99);
        foodItemList.add(burger);

        FoodItem burrito = new FoodItem(
                R.drawable.burrito,
                "Burrito",
                "Our burritos are made in Mexico," +
                        "with native beans, and served with" +
                        "tortilla chips",
                5.99);
        foodItemList.add(burrito);

        FoodItem cupcake = new FoodItem(
                R.drawable.cupcake,
                "Cupcake",
                "A small sweet baked good," +
                        "topped with frosting and sprinkles",
                3.00);
        foodItemList.add(cupcake);

        FoodItem doughnut = new FoodItem(
                R.drawable.doughnut,
                "Doughnut",
                "A ring-shaped deep fried dough," +
                        "covered with powdered sugar",
                3.50);
        foodItemList.add(doughnut);

        FoodItem frenchFries = new FoodItem(
                R.drawable.french_fries,
                "French Fries",
                "Deep fried potatoes that have been cut " +
                        "into thin strips, served with ketchup",
                2.00);
        foodItemList.add(frenchFries);

        FoodItem hotDog = new FoodItem(
                R.drawable.hot_dog,
                "Hot Dog",
                "A grilled sausage served in a sliced bun" +
                        " with ketchup or mustard",
                4.00);
        foodItemList.add(hotDog);

        FoodItem iceCream = new FoodItem(
                R.drawable.ice_cream,
                "Ice Cream",
                "A sweet creamy frozen food, " +
                        "served in a cone or a tub",
                2.00);
        foodItemList.add(iceCream);

        FoodItem pizza = new FoodItem(
                R.drawable.pizza,
                "Pizza",
                "A thinly rolled bread dough, " +
                        "topped with tomatoes and cheese",
                8.00);
        foodItemList.add(pizza);

        FoodItem ramen = new FoodItem(
                R.drawable.ramen,
                "Ramen",
                "A Japanese dish, with clear broth " +
                        "and thin white noodles",
                10.00);
        foodItemList.add(ramen);

        FoodItem sandwich = new FoodItem(
                R.drawable.sandwich,
                "Sandwich",
                "Meat, cheese or vegetables " +
                        "between two slices of bread",
                5.00);
        foodItemList.add(sandwich);

        foodItemAdapter = new FoodItemAdapter(foodItemList);

        recyclerView.setAdapter(foodItemAdapter);

    }
}