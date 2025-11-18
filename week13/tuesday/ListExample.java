package com.example.csc164week13;

import java.util.ArrayList;

class Order {
    private ArrayList<Food> stuff = new ArrayList<>();

    public ArrayList<Food> getStuff() {
        return stuff;
    }

    public void setStuff(ArrayList<Food> stuff) {
        this.stuff = stuff;
    }

    public void addItem(Food food) {
        stuff.add(food);
    }
}
class Food {

}

public class ListExample {
    public static void main(String[] args) {
        Order order = new Order();
        Food burger = new Food();

        order.addItem(burger);

        order.getStuff().add(burger);
    }
}
