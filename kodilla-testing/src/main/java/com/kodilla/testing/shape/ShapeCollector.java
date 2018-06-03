package com.kodilla.testing.shape;

import java.util.ArrayList;
import com.kodilla.testing.shape.*;

public class ShapeCollector {
private ArrayList<Shape> listOfShapes = new ArrayList<Shape>();

    public int checkingListSize(){
        return listOfShapes.size();
    }
    public void addFigure(Shape shape){
        listOfShapes.add(shape);
    }
   public void removeFigure(Shape shape){
       listOfShapes.remove(shape);
   }
   public Shape getFigure(int n){
       return listOfShapes.get(n);
   }
   public void showFigures(){
       System.out.println(listOfShapes);
   }


}
