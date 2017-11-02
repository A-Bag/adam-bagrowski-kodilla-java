package com.kodilla.good.patterns.challenges;

public class SmsService implements InformationService {
    public void inform(User user) {
        System.out.println("Sending sms to " + user.getName() + " " + user.getSurname() + " ...");
        System.out.println("Message sent!\n");
    }
}
