package Loops;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter Number to check If it is a Palindrome or not : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num < 0) {
            System.out.println(num + " is not a Palindrome");
            return;
        }
        if(num == reverseDigits(num)){
            System.out.println(num + " is a Palindrome");
        }
        else{
            System.out.println(num + " is not a Palindrome");
        }
        scan.close();
    }
    public static int reverseDigits(int num){
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum = sum * 10 + digit;
            num /= 10;
        }
        return sum;
    }
}