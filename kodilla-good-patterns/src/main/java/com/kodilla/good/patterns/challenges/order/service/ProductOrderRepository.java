package com.kodilla.good.patterns.challenges.order.service;

import java.time.LocalDate;

public interface ProductOrderRepository {
    void addOrder(User user, Product product, LocalDate dateOfOrder);
}
