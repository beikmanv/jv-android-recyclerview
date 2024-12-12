package com.northcoders.northcodersrestaurant;

import com.northcoders.northcodersrestaurant.model.FoodItem;
import com.nothcoders.northcodersrestaurant.R;

import java.util.ArrayList;
import java.util.List;

public class FoodItemDataSource {

    public static List<FoodItem> getFoodItems() {
        List<FoodItem> foodItemList = new ArrayList<>();

        foodItemList.add(new FoodItem(
                R.drawable.burger,
                "Burger",
                "Our burgers are made with 100% Aberdeen Angus beef, " +
                        "char-grilled to perfection, and served with " +
                        "our in-house relish on a brioche bun",
                10.99));

        foodItemList.add(new FoodItem(
                R.drawable.burrito,
                "Burrito",
                "Our burritos are made in Mexico, " +
                        "with native beans, and served with " +
                        "tortilla chips",
                5.99));

        foodItemList.add(new FoodItem(
                R.drawable.cupcake,
                "Cupcake",
                "A small sweet baked good," +
                        "topped with frosting and sprinkles",
                3.00));

        foodItemList.add(new FoodItem(
                R.drawable.doughnut,
                "Doughnut",
                "A ring-shaped deep fried dough," +
                        "covered with powdered sugar",
                3.50));

        foodItemList.add(new FoodItem(
                R.drawable.french_fries,
                "French Fries",
                "Deep fried potatoes that have been cut " +
                        "into thin strips, served with ketchup",
                2.00));

        foodItemList.add(new FoodItem(
                R.drawable.hot_dog,
                "Hot Dog",
                "A grilled sausage served in a sliced bun" +
                        " with ketchup or mustard",
                4.00));

        foodItemList.add(new FoodItem(
                R.drawable.ice_cream,
                "Ice Cream",
                "A sweet creamy frozen food, " +
                        "served in a cone or a tub",
                2.00));

        foodItemList.add(new FoodItem(
                R.drawable.pizza,
                "Pizza",
                "A thinly rolled bread dough, " +
                        "topped with tomatoes and cheese",
                8.00));

        foodItemList.add(new FoodItem(
                R.drawable.ramen,
                "Ramen",
                "A Japanese dish, with clear broth " +
                        "and thin white noodles",
                10.00));

        foodItemList.add(new FoodItem(
                R.drawable.sandwich,
                "Sandwich",
                "Meat, cheese or vegetables " +
                        "between two slices of bread",
                5.00));

        foodItemList.add(new FoodItem(
                R.drawable.restaurant,
                "Restaurant",
                "The whole restaurant with all food available " +
                        "(for VIP clients only)",
                500000.00));

        return foodItemList;
    }
}
