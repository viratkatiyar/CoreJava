package Loops;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = scan.nextInt();
        System.out.println("Inverse of " + num + " : " + printInverse(num));

    }
    public static int printInverse(int num){
        int inverseNum = 0;
        int oldPosition = 1;
        while(num > 0){
            int oldDigit = num % 10;
            inverseNum += oldPosition * (int)Math.pow(10, oldDigit - 1);
            num /= 10;
            oldPosition++;
        }
        return inverseNum;
    }
}
