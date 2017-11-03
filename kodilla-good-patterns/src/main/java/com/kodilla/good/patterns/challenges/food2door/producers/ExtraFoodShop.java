package com.kodilla.good.patterns.challenges.food2door.producers;

public class ExtraFoodShop implements Producer {


    public boolean process(){
        System.out.println("Processing the order of the ExtraFoodShop..");
        return true;
    }
}
