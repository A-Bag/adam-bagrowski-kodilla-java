package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Arrange
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = (Board)context.getBean("getBoard");
        board.toDoList.addTask("task1");
        board.inProgressList.addTask("task2");
        board.doneList.addTask("task3");
        //Act
        String toDoTask = board.toDoList.getLastTask();
        String inProgressTask = board.inProgressList.getLastTask();
        String doneTask = board.doneList.getLastTask();
        //Assert
        Assert.assertEquals("task1", toDoTask);
        Assert.assertEquals("task2", inProgressTask);
        Assert.assertEquals("task3", doneTask);
    }
}
