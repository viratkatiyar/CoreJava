package Loops;

import java.util.Scanner;

public class SumOfOddTillN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to get sum of odd till n : ");
        int num = scan.nextInt();
        int sum = 0;

        for(int i = 1; i <= num; i += 2){
                sum += i;
        }
        System.out.println("Sum of Odd Numbers till n : " + sum);
    }
}
