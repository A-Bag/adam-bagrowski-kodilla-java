package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Arrange
        int[] testArray = {1,2,3,4,5,6,7,8,9,10};

        //Act
        double average = ArrayOperations.getAverage(testArray);

        //Assert
        Assert.assertEquals(5.5, average, 0.001);
    }
}
