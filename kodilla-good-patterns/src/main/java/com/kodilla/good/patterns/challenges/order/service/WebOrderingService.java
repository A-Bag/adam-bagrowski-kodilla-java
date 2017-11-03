package com.kodilla.good.patterns.challenges.order.service;

import java.time.LocalDate;

public class WebOrderingService implements OrderingService {
    public boolean createOrder(User user, Product product, LocalDate dateOfOrder) {
        System.out.println("Order:" +
                "\n  User: " + user + "\n  Product: " + product + "\n  Date of order: " + dateOfOrder +
                "\nis being created...");
        System.out.println("Order created!\n");
        return true;
    }
}
