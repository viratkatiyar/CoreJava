package Fibonacci;

import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {
    public static void main(String[] args) {
        System.out.print("Enter n (no. of terms) to get fibonacci series till that : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fibonacci Series " + n + " terms : ");
        for (int i = 0; i < n; i++) {
            System.out.print(printFibonacci(i + 1) + " ");
        }
    }
    public static int printFibonacci(int n){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        return printFibonacci(n - 1) + printFibonacci(n - 2);
    }
}
