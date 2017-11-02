package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class XyzProductOrderRepository implements ProductOrderRepository{
    public void addOrder(User user, Product product, LocalDate dateOfOrder) {
        System.out.println("Order is being added to repository...");
        System.out.println("Order added!\n");
    }
}
