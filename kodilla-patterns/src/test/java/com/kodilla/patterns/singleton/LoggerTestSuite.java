package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Arrange
        //Act
        Logger.getInstance().log("log1");
        String log1 = Logger.getInstance().getLastLog();
        //Assert
        Assert.assertEquals("log1", log1);
    }
}
