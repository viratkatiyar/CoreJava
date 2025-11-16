package Basics;

import java.util.Scanner;

public class AddingInputNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = scan.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = scan.nextInt();
        System.out.println("Result : " + (num1 + num2));
    }
}
