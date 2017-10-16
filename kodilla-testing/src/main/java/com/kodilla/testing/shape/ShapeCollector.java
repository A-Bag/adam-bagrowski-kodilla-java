package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape){
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape){
        if (!figures.contains(shape)) {
            return false;
        }
        figures.remove(shape);
        return true;
    }

    public Shape getFigure(int n){
        if (n<0 || n>=getFiguresQuantity()) {
            return null;
        }
        return figures.get(n);
    }

    public String showFigures(){
        String showedFigures = "";
        for(Shape figure: figures) {
            showedFigures += figure + "/n";
        }
        return showedFigures;
    }

    public int getFiguresQuantity(){
        return figures.size();
    }
}
