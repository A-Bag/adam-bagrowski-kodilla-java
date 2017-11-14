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
        board.addTaskToToDoList("task1");
        board.addTaskToInProgressList("task2");
        board.addTaskToDoneList("task3");
        //Act
        String toDoTask = board.getLastTaskFromToDoList();
        String inProgressTask = board.getLastTaskFromInProgressList();
        String doneTask = board.getLastTaskFromDoneList();
        //Assert
        Assert.assertEquals("task1", toDoTask);
        Assert.assertEquals("task2", inProgressTask);
        Assert.assertEquals("task3", doneTask);
    }
}
