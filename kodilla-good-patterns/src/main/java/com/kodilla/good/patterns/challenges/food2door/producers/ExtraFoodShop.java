package com.kodilla.good.patterns.challenges.food2door.producers;

import java.util.Random;

public class ExtraFoodShop implements Producer {


    public boolean process(){
        System.out.println("Processing the order of the ExtraFoodShop..");
        Random generator = new Random();
        return generator.nextBoolean();
    }
}
