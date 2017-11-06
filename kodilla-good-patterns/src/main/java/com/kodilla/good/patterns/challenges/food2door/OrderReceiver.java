package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.producers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.producers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.producers.HealthyShop;

import java.util.Arrays;
import java.util.List;

public class OrderReceiver {


    public List<Order> receive () {

        return Arrays.asList(new Order(new ExtraFoodShop(), "Apples", 100),
                new Order(new GlutenFreeShop(), "Milk", 100),
                new Order(new HealthyShop(), "Eggs", 100));
    }
}
