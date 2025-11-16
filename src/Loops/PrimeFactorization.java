package Loops;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to get its Prime factors : ");
        int num = scan.nextInt();
        System.out.print("Prime Factorization of " + num + " : ");
        primeFactorization(num);
    }
    public static void primeFactorization(int num){
       for(int i = 2; i * i <= num; i++){
           if(num % i == 0){
               System.out.print(i + " ");
               while(num % i == 0){
                   num /= i;
               }
           }
       }
       if(num != 1) {
           System.out.print(num);
       }
    }
}
