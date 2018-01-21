package com.kodilla.patterns2.decorator.pizza;

import static org.junit.Assert.*;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaMushroomsHamDoubleExtraCheeseGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(23), thePrice);
    }

    @Test
    public void testPizzaMushroomsHamDoubleExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and cheese + mushrooms + ham + extra cheese + extra cheese",
                description);
    }
}
