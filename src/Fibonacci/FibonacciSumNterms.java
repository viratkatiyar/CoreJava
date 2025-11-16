package Fibonacci;

import java.util.Scanner;

public class FibonacciSumNterms {
    public static void main(String[] args) {
        System.out.println("Enter no. of terms till you want to sum fibonacci series : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.print("Fibonacci sum till " + num + " terms : ");
        fibonacciSumTillNterms(num);
        System.out.println();
        System.out.print("Fibonacci till " + num + " terms : ");
        FibonacciTillNterms.fibonacciTillNterms(num);
        scan.close();
    }
    public static void fibonacciSumTillNterms(int num){
        if(num <= 0){
            System.out.println("Sum is not defined for zero or negative terms");
        }
        else if(num == 1){
            System.out.println(0);
        }
        else if(num == 2) {
            System.out.println(1);
        }
        else{
            int term1 = 0;
            int term2 = 1;
            int i = 3;
            int sum = 1;
            while(i <= num){
                int term3 = (term2 + term1);
                term1 = term2;
                term2 = term3;
                sum += term3;
                i++;
            }
            System.out.print(sum);
        }
    }
}