package Loops;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number to reverse its Digits : ");
        int num = scan.nextInt();
        System.out.println("Reverse Digits Of " + num + " : " + reverseDigits(num));
        scan.close();
    }
    public static int reverseDigits(int num){
        boolean isNegative = num < 0;
        if(isNegative) num = -num;
        int newNum = 0;
        while(num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return isNegative ? -newNum : newNum;
    }

    // not work for 250 because in that case 0 is added also
    //Trailing zeros are lost when reversing numbers using integers
    // handling case below
    public static String reverseDigitsString(int num) {
        boolean isNegative = num < 0;
        String str = Integer.toString(Math.abs(num));
        String reversed = new StringBuilder(str).reverse().toString();
        return isNegative ? "-" + reversed : reversed;
    }
}