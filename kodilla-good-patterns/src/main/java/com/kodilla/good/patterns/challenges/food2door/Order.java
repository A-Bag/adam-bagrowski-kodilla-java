package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.producers.Producer;

public class Order {
    private Producer producer;
    private String product;
    private int quantityInKg;

    public Order(Producer producer, String product, int quantityInKg) {
        this.producer = producer;
        this.product = product;
        this.quantityInKg = quantityInKg;
    }

    public Producer getProducer() {
        return producer;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantityInKg() {
        return quantityInKg;
    }
}
