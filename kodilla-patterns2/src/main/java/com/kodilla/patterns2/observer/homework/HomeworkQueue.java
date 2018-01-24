package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class HomeworkQueue implements Observable{
    private List<Observer> observers;
    private Deque<Task> queue;
    private Student student;

    public HomeworkQueue() {
        this.observers = new ArrayList<>();
        this.queue = new ArrayDeque<>();
    }

    public void addTask(Task task) {
        queue.offer(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(this);
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public Deque<Task> getQueue() {
        return queue;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
