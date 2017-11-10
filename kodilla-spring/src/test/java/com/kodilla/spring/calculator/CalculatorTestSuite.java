package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Arrange
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean("calculator");
        //Act
        double sum = calculator.add(4.8, 2.2);
        double diff = calculator.sub(4.8, 2.2);
        double prod = calculator.mul(4.8, 2.0);
        double quot = calculator.div(4.8, 0.0);
        //Assert
        Assert.assertEquals(7.0, sum, 0.001);
        Assert.assertEquals(2.6, diff, 0.001);
        Assert.assertEquals(9.6, prod, 0.001);
        Assert.assertEquals(-1.0, quot, 0.001);
    }
}
