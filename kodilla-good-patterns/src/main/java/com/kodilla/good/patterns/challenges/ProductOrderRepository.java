package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface ProductOrderRepository {
    void addOrder(User user, Product product, LocalDate dateOfOrder);
}
