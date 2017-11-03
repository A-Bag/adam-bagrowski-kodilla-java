package com.kodilla.good.patterns.challenges.food2door.producers;

public class GlutenFreeShop implements Producer{
    public boolean process(){
        System.out.println("Processing the order of the GlutenFreeShop..");
        return true;
    }
}
