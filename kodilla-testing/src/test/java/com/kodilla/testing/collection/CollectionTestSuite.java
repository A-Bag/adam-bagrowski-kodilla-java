package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    OddNumbersExterminator oddNumbersExterminator;
    List<Integer> numbers;

    @Before
    public void before(){
        System.out.println("Test Case: begin");
        oddNumbersExterminator = new OddNumbersExterminator();
        numbers = new ArrayList<>();
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Arrange
        for (int i=0; i<100; i++){
            numbers.add(i);
        }
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i=0; i<100; i+=2){
            evenNumbers.add(i);
        }
        //Act
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        //Assert
        Assert.assertEquals(evenNumbers, result);
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Arrange
        //Act
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        //Assert
        Assert.assertEquals(numbers, result);
    }
}
