package Basics;

import java.util.Scanner;

public class OddEvenUsingBitwise {
    public static void main(String[] args) {
        System.out.println("Enter Integer to Check If it is even Or Odd : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if((num & 1) == 1){
            System.out.println(num + " is Odd");
        }
        else{
            System.out.println(num + " is Even");
        }

    }
}