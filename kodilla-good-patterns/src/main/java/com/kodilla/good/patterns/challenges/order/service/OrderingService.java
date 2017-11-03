package com.kodilla.good.patterns.challenges.order.service;

import java.time.LocalDate;

public interface OrderingService {
    boolean createOrder(User user, Product product, LocalDate dateOfOrder);
}
