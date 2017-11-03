package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.producers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.producers.Producer;

public class OrderReceiver {
    private Producer producer = new ExtraFoodShop();
    private String product = "Apples";
    private int quantity = 100;

    public Order receive () {
        return new Order(producer, product, quantity);
    }
}
