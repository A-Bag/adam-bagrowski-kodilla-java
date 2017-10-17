package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape){
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape){
        return figures.remove(shape);
    }

    public Shape getFigure(int n){
        if (n<0 || n>=getFiguresQuantity()) {
            return null;
        }
        return figures.get(n);
    }

    public String showFigures(){
        StringBuilder showedFigures = new StringBuilder();
        for(Shape figure: figures) {
            showedFigures.append(figure + "/n");
        }
        return showedFigures.toString();
    }

    public int getFiguresQuantity(){
        return figures.size();
    }
}
