package Loops;

import java.util.Scanner;

public class FrequencyOfDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int digit = scan.nextInt();
        System.out.println("Frequency of " + digit + " in " + num + " : " + frequencyDigits(num, digit));
    }
    public static int frequencyDigits(int n, int digit){
        int count = 0;
        while(n != 0){
           int numDigit = n % 10;
           if(numDigit == digit){
               count ++;
           }
           n /= 10;
        }
        return count;
    }
}
