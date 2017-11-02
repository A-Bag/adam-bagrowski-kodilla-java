package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Jan", "Kowalski", "Warsaw", "111111111");
        Product product = new Product("Grand Theft Auto 5", 1234);
        LocalDate dateOfOrder = LocalDate.now();

        return new OrderRequest(user, product, dateOfOrder);
    }
}
