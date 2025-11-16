package Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = scan.nextInt();
        printPattern12(rows);
    }
    public static void printPattern12(int n){
        int fib1 = 0;
        int fib2 = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(fib1 + "\t");
                int fib3 = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib3;
            }
            System.out.println();
        }
    }
}
