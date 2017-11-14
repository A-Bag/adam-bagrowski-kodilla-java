package com.kodilla.spring.portfolio;


public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public String getLastTaskFromToDoList() {
        return toDoList.getLastTask();
    }

    public String getLastTaskFromInProgressList() {
        return inProgressList.getLastTask();
    }

    public String getLastTaskFromDoneList() {
        return doneList.getLastTask();
    }

    public void addTaskToToDoList(String task) {
        toDoList.addTask(task);
    }

    public void addTaskToInProgressList(String task) {
        inProgressList.addTask(task);
    }

    public void addTaskToDoneList(String task) {
        doneList.addTask(task);
    }
}
