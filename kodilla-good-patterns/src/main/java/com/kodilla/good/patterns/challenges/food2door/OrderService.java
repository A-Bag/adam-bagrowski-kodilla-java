package com.kodilla.good.patterns.challenges.food2door;

public class OrderService {
    Order order;

    public OrderService(Order order) {
        this.order = order;
    }

    public void process() {
        boolean isOrderCompleted = order.getProducer().process();
        if (isOrderCompleted) {
            System.out.println("Order completed!");
        } else {
            System.out.println("Processing failed!");
        }
    }
}
