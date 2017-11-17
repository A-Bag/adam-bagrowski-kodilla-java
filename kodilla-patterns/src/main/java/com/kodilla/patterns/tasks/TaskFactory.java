package com.kodilla.patterns.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";

    public final Task createTask(final String kindOfTask) {
        switch (kindOfTask) {
            case SHOPPING: return new ShoppingTask("Shopping", "Beer", 24);
            case DRIVING: return new DrivingTask("Driving", "Bialystok", "Train");
            case PAINTING: return new PaintingTask("Painting", "blue", "wall");
            default: return null;
        }
    }
}
