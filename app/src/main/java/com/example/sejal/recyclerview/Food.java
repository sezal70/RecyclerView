package com.example.sejal.recyclerview;

import java.io.Serializable;
import java.lang.reflect.Constructor;

/**
 * Created by Sejal on 4/30/2017.
 */

public class Food implements Serializable{

    String name;
    Double price;
    int icon;

    public Food(String name, Double price, int icon) {
        this.name = name;
        this.price = price;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getIcon() {
        return icon;
    }
}
