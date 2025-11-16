package Basics;

import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {
        System.out.println("Enter First Number : ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = scan.nextInt();
        //Bitwise Operations
        System.out.println(num1 & num2);
        System.out.println(num1 | num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1);
        System.out.println(~num2);
        System.out.println(num1>>1);
        System.out.println(num1>>2);
        System.out.println(num2<<2);
        System.out.println(num1>>>2);
    }
}
