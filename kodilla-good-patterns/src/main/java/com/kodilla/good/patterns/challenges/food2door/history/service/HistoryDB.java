package com.kodilla.good.patterns.challenges.food2door.history.service;

import com.kodilla.good.patterns.challenges.food2door.Order;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

public class HistoryDB {
    private List<Order> ordersHistory = new ArrayList<>();

    public boolean addOrder(Order order) {
        return ordersHistory.add(order);
    }
}
