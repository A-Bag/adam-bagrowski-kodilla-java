package com.kodilla.patterns.social;

import com.kodilla.patterns.social.publisher.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Arrange
        User jan = new Millenials("Jan");
        User wojtek = new YGeneration("Wojciech");
        User tomek = new ZGeneration("Tomek");

        //Act
        String janCommunicatesBy = jan.sharePost();
        System.out.println("Jan: " + janCommunicatesBy);
        String wojtekCommunicatesBy = wojtek.sharePost();
        System.out.println("Wojtek: " + wojtekCommunicatesBy);
        String tomekCommunicatesBy = tomek.sharePost();
        System.out.println("Tomek: " + tomekCommunicatesBy);

        //Assert
        Assert.assertEquals("Communication by facebook", janCommunicatesBy);
        Assert.assertEquals("Communication by twitter", wojtekCommunicatesBy);
        Assert.assertEquals("Communication by snapchat", tomekCommunicatesBy);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Arrange
        User jan = new Millenials("Jan");

        //Act
        jan.setSocialPublisher(new TwitterPublisher());
        String janCommunicatesBy = jan.sharePost();
        System.out.println("Jan now: " + janCommunicatesBy);

        //Assert
        Assert.assertEquals("Communication by twitter", janCommunicatesBy);
    }
}
