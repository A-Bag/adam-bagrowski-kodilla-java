package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.history.service.HistoryService;
import com.kodilla.good.patterns.challenges.food2door.information.service.EmaiInformationService;
import com.kodilla.good.patterns.challenges.food2door.information.service.InformationService;

import java.util.List;

public class OrderService {
    private List<Order> listOfOrders;
    private InformationService informationService;
    private HistoryService historyService;

    public OrderService(List<Order> listOfOrders, InformationService informationService, HistoryService historyService) {
        this.listOfOrders = listOfOrders;
        this.informationService = informationService;
        this.historyService = historyService;
    }

    public void process() {
        for (Order order: listOfOrders) {
            boolean isOrderCompleted = order.getProducer().process();
            if (isOrderCompleted) {
                informationService.sendMessage();
                historyService.addOrderToTheOrderHistory(order);
                System.out.println("Order completed!\n");
            } else {
                System.out.println("Processing failed!\n");
            }
        }
    }
}
