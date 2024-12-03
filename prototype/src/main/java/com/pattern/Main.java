package com.pattern;

import com.pattern.shapes.Circle;
import com.pattern.shapes.Rectangle;
import com.pattern.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        shapes.add(circle);

        Rectangle rectangle = new Rectangle();
        rectangle.x = 10;
        rectangle.y = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneShape(shapes, shapesCopy);

    }

    private static void cloneShape(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects. (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical objects. (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (boo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same. (boo!)");
            }
        }
    }
}