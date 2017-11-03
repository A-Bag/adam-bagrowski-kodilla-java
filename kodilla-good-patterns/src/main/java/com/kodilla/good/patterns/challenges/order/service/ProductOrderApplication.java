package com.kodilla.good.patterns.challenges.order.service;


public class ProductOrderApplication {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new SmsService(), new WebOrderingService(), new DBProductOrderRepository());
        productOrderService.process(orderRequest);
    }
}
