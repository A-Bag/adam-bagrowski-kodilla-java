package com.kodilla.good.patterns.challenges.food2door;

public class Food2DoorApplication {
    public static void main(String[] args) {
        OrderReceiver orderReceiver = new OrderReceiver();
        Order order = orderReceiver.receive();
        OrderService orderService = new OrderService(order);
        orderService.process();
    }
}
