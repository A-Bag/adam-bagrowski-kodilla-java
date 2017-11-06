package com.kodilla.good.patterns.challenges.food2door.information.service;

public class EmaiInformationService implements InformationService{
    @Override
    public void sendMessage() {
        System.out.println("   Sending an order confirmation e-mail..");
        System.out.println("   E-mail sent!");
    }
}
