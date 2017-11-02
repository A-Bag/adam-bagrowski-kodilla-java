package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private OrderingService orderingService;
    private ProductOrderRepository productOrderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderingService orderingService,
                               final ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.orderingService = orderingService;
        this.productOrderRepository = productOrderRepository;
    }

    public void process(OrderRequest orderRequest) {
        AbcOrderingService abcOrderingService = new AbcOrderingService();
        boolean isOrderCreated = abcOrderingService.createOrder(
                orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getDateOfOrder());

        if(isOrderCreated) {
            informationService.inform(orderRequest.getUser());
            productOrderRepository.addOrder(
                    orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getDateOfOrder());
        } else {
            System.out.println("Processing failed!");
        }
    }
}
