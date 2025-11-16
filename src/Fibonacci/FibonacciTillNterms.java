package Fibonacci;

import java.util.Scanner;

public class FibonacciTillNterms {
    public static void main(String[] args) {
        System.out.println("Enter no. of terms till you want to print fibonacci series : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.print("Fibonacci till " + num + " terms : ");
        fibonacciTillNterms(num);
        scan.close();
    }
    public static void fibonacciTillNterms(int num){
        if(num <= 0){
            System.out.println("terms cant be negative or Zero");
        }
        else if(num == 1){
            System.out.println("0");
        }
        else{
            int term1 = 0;
            System.out.print("0 ");
            int term2 = 1;
            System.out.print("1 ");
            int i = 3;
            while(i <= num){
                int term3 = (term2 + term1);
                System.out.print(term3 + " ");
                term1 = term2;
                term2 = term3;
                i++;
            }
        }

    }
}
