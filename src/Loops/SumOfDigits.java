package Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number to get Sum of Digits : ");
        int num = scan.nextInt();
        int originalNum = num;
        int sumOfDigits = 0;
        while(num > 0){ //can use for loop but initialization and update is empty
            sumOfDigits += num % 10;
            num /= 10;
        }
        System.out.println("Sum of Digits of " + originalNum + " : " + sumOfDigits);
    }
}
