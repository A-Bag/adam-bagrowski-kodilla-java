package com.kodilla.patterns.tasks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TaskFactoryTestSuite {
    private TaskFactory taskFactory;

    @Before
    public void before() {
        taskFactory = new TaskFactory();
    }

    @Test
    public void testShoppingTask() {
        //Arrange
        //Act
        Task shopping = taskFactory.createTask(TaskFactory.SHOPPING);
        shopping.executeTask();

        //Assert
        Assert.assertEquals(true, shopping.isTaskExecuted());
        Assert.assertEquals("Shopping", shopping.getTaskName());
    }

    @Test
    public void testDrivingTask() {
        //Arrange
        //Act
        Task driving = taskFactory.createTask(TaskFactory.DRIVING);
        driving.executeTask();

        //Assert
        Assert.assertEquals(true, driving.isTaskExecuted());
        Assert.assertEquals("Driving", driving.getTaskName());
    }

    @Test
    public void testPaintingTask() {
        //Arrange
        //Act
        Task painting = taskFactory.createTask(TaskFactory.PAINTING);
        painting.executeTask();

        //Assert
        Assert.assertEquals(true, painting.isTaskExecuted());
        Assert.assertEquals("Painting", painting.getTaskName());
    }
}
