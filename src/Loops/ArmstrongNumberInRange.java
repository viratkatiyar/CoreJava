package Loops;

import java.util.Scanner;

public class ArmstrongNumberInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Min Limit to get Armstrong Number :");
        int num1 = scan.nextInt();
        System.out.println("Enter Max Limit to get Armstrong Number :");
        int num2 = scan.nextInt();
        System.out.print("Armstrong Number Between " + num1 + " and " + num2 + " : ");
        printArmstrong(num1, num2);
        scan.close();
    }
    public static void printArmstrong(int num1, int num2){
        for(int min = num1; min <= num2; min++){
            int originalNum = min;
            int digits = String.valueOf(min).length();// CountDigits can also be used
            int sum = 0;
            while(originalNum > 0){
                int digit  = originalNum % 10;
                sum += (int) Math.pow(digit, digits);
                originalNum /= 10;
            }
            if (sum == min){
                System.out.println(min + "");
            }
        }
    }
    public static int countDigits(int num){
        if(num == 0) {
            return 1;
        }
        int count = 0;
        while(num > 0){
            num /= 10;
            count ++;
        }
        return count;
    }
}
