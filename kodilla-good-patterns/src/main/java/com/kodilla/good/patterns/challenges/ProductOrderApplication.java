package com.kodilla.good.patterns.challenges;


public class ProductOrderApplication {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new SmsService(), new AbcOrderingService(), new XyzProductOrderRepository());
        productOrderService.process(orderRequest);
    }
}
