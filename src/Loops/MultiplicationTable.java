package Loops;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter Number to Print Multiplication Table :");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println("Table of " + num1 + " : ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num1 + " * " + i + " = " + (num1 * i));
        }
    }
}
