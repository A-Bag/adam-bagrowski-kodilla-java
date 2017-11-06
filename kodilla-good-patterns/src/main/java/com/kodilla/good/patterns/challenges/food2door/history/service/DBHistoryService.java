package com.kodilla.good.patterns.challenges.food2door.history.service;

import com.kodilla.good.patterns.challenges.food2door.Order;

public class DBHistoryService implements HistoryService {
    @Override
    public void addOrderToTheOrderHistory(Order order) {
        System.out.println("   Adding order to the order history database..");
        System.out.println("   Order added!");
    }
}
