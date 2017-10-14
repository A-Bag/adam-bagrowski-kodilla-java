package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Arrange
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        for (int i=0; i<100; i++){
            numbers.add(i);
        }
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i=0; i<100; i=i+2){
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
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();
        //Act
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        //Assert
        Assert.assertEquals(emptyList, result);
    }
}
