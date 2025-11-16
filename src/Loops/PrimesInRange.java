package Loops;

import java.util.Scanner;

public class PrimesInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int low = scan.nextInt();
        int high = scan.nextInt();
        printPrimeInRange(low, high);
        System.out.print("all primes between low and high(both included)");
        scan.close();
    }
    public static void printPrimeInRange(int low, int high){
            int i = low;
            while(i <= high){
                int count = 0;
                for(int j = 2; j * j <= i;j++ ){
                    if(i % j == 0){
                        count++;
                        break; // because 1 count digit is enough for rejecting prime
                    }
                }
                if(count == 0){
                    System.out.print(" " + i);
                }
                i++;
            }
        System.out.println();
        }
    }
