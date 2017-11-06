package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.history.service.DBHistoryService;
import com.kodilla.good.patterns.challenges.food2door.information.service.EmailInformationService;

import java.util.List;

public class Food2DoorApplication {
    public static void main(String[] args) {
        OrderReceiver orderReceiver = new OrderReceiver();
        List<Order> listOfOrders = orderReceiver.receive();
        OrderService orderService = new OrderService(new EmailInformationService(), new DBHistoryService());
        orderService.process(listOfOrders);
    }
}
