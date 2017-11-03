package com.kodilla.good.patterns.challenges.food2door.producers;

public class HealthyShop implements Producer{
    public boolean process(){
        System.out.println("Processing the order of the HealthyShop..");
        return true;
    }
}
