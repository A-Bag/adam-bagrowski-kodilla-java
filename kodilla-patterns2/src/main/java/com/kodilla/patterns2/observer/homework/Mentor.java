package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        System.out.println("Student " + homeworkQueue.getStudent() + " has done a new task. " +
                "\nYou have " + homeworkQueue.getQueue().size() + " tasks of this student to review.");
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
