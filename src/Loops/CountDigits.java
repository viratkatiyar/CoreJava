package Loops;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number to count its digit : ");
        int num = scan.nextInt();
        System.out.println(num + " has " + countDigits(num) + " digits");
    }
    public static int countDigits(int num){
        if(num == 0){
            return 1;
        }
        if(num < 0){
            num = -(num);
        }
        int digits = 0;
        while(num > 0){
            num /= 10;
            digits ++;
        }
        return digits;
    }
}