package Basics;

import java.util.Scanner;

public class SwappingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1 :");
        int num1 = scan.nextInt();
        System.out.println("Enter num2 :");
        int num2 = scan.nextInt();
        // Swapping num1 and num2
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
    }
}
