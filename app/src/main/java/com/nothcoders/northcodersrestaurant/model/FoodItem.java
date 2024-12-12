package com.nothcoders.northcodersrestaurant.model;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class FoodItem {

    private int itemImg;
    private String itemName;
    private String itemDescription;
    private double itemPrice;

    public FoodItem(int itemImg, String itemName, String itemDescription, double itemPrice) {
        this.itemImg = itemImg;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    public FoodItem() {

    }

    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String  getItempriceAsString() {
        return String.valueOf(itemPrice);
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setAgeAsString(String itemPrice) {
            setItemPrice(Integer.parseInt(itemPrice));
    }

    @BindingAdapter("android:src")
    public static void setImageResource(ImageView imageView, int resource) {
        imageView.setImageResource(resource);
    }
}
