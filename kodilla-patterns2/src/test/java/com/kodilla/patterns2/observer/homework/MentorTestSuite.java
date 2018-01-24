package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Student student1 = new Student("student1");
        Student student2 = new Student("student1");
        Student student3 = new Student("student1");
        Mentor mentor1 = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");
        student1.getHomeworkQueue().registerObserver(mentor1);
        student2.getHomeworkQueue().registerObserver(mentor1);
        student3.getHomeworkQueue().registerObserver(mentor2);
        //When
        student1.getHomeworkQueue().addTask(new Task("task1", "link1"));
        student1.getHomeworkQueue().addTask(new Task("task2", "link1"));
        student2.getHomeworkQueue().addTask(new Task("task1", "link2"));
        student2.getHomeworkQueue().addTask(new Task("task2", "link2"));
        student2.getHomeworkQueue().addTask(new Task("task3", "link2"));
        student3.getHomeworkQueue().addTask(new Task("task1", "link3"));
        //Then
        assertEquals(5, mentor1.getUpdateCount());
        assertEquals(1, mentor2.getUpdateCount());
    }
}