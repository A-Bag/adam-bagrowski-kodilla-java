package com.kodilla.patterns2.observer.homework;

public class Student {
    private String name;
    private HomeworkQueue homeworkQueue;

    public Student(String name) {
        this.name = name;
        this.homeworkQueue = new HomeworkQueue();
        homeworkQueue.setStudent(this);
    }

    public String getName() {
        return name;
    }

    public HomeworkQueue getHomeworkQueue() {
        return homeworkQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}
