package Basics;

import java.util.Scanner;

public class MathClassUsage {
    double radius;
    double getArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
    double getCircumference(double radius){
        return Math.PI * 2 * radius;
    }

    MathClassUsage(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle :\nArea of Circle : " + getArea(radius) + "\nCircumference of Circle : " + getCircumference(radius);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        double radius = scan.nextDouble();
        MathClassUsage m1 = new MathClassUsage(radius);
        System.out.print(m1);
    }
}
