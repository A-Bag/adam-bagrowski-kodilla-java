package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.history.service.HistoryService;
import com.kodilla.good.patterns.challenges.food2door.information.service.InformationService;

import java.util.List;

public class OrderService {
    private InformationService informationService;
    private HistoryService historyService;

    public OrderService(InformationService informationService, HistoryService historyService) {
        this.informationService = informationService;
        this.historyService = historyService;
    }

    public void process(List<Order> listOfOrders) {
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
