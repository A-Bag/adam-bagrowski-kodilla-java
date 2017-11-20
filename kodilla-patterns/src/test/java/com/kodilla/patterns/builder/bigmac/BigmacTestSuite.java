package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Arrange
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .sauce("barbecue")
                .roll("withSesame")
                .burgers(1)
                .defaultIngredients()
                .additionalIngredient("bacon")
                .additionalIngredient("chilli pepper")
                .build();
        System.out.println(bigmac);

        //Act
        int numberOfIngredients = bigmac.getIngredients().size();
        String expectedString = "Bigmac{" +
                "roll='" + "withSesame" + '\'' +
                ", burgers=" + 1 +
                ", sauce='" + "barbecue" + '\'' +
                ", ingredients=" + "[salad, onion, pickle, cheese, bacon, chilli pepper]" +
                '}';

        //Assert
        Assert.assertEquals(6, numberOfIngredients);
        Assert.assertEquals(expectedString, bigmac.toString());
    }
}
