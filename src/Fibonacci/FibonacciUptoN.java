package Fibonacci;

import java.util.Scanner;

public class FibonacciUptoN {
    public static void main(String[] args) {
        System.out.println("Enter any Number till which you want fibonacci series : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.print("Fibonacci Series upto " + num + " : ");
        fibonacci(num);
    }
    public static void fibonacci(int num) {
        if (num < 0) {
            System.out.println("Invalid");
        } else {
            int term1 = 0;
            int term2 = 1;
            System.out.print(term1 + " ");
            while (term2 <= num) {
                System.out.print(term2 + " ");
                int term3 = term1 + term2;
                term1 = term2;
                term2 = term3;
            }
        }
    }
    public static void fibonacciTillLimit() {
        int limit = 100; // You can change this to any number you want
        int a = 0, b = 1;
        System.out.print("Fibonacci series up to " + limit + ": ");
        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}