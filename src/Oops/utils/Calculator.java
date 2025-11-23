package ClassesAndObjects.utils;

import ClassesAndObjects.geometry.Circle;
import ClassesAndObjects.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        Rectangle rect = new Rectangle(10, 5);
        System.out.printf("Area of Circle : %f", circleArea(circle.radius));
        System.out.printf("\nArea of Rectangle : %f", rectArea(rect.length, rect.breadth));
    }
    public static double circleArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
    public static double rectArea(double length, double breadth){
        return length * breadth;
    }
}
