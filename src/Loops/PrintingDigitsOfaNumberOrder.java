package Loops;

import java.util.Scanner;

public class PrintingDigitsOfaNumberOrder {
    public static void main(String[] args) {
        System.out.println("Enter Number to Print its digit : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Digits of " + num + " : ");
        printDigitsOrder(num);
    }
    public static void printDigitsOrder(int num){
        int digits = 0;
        int temp = num;
        while(temp != 0){
            temp /= 10;
            digits ++;
        }
        int decimalPlaces = (int) Math.pow(10, digits - 1);
        while(decimalPlaces != 0){
            int digit = num / decimalPlaces;
            System.out.print(digit + " ");
            num %= decimalPlaces;
            decimalPlaces /= 10;
        }

    }
}
