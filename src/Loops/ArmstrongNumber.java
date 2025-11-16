package Loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //Armstrong Number (or Narcissistic Number) is a number that is equal to the sum of its digits each raised to the power of the number of digits.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number to check whether it ia a Armstrong Number or Not :");
        int num = scan.nextInt();
        if(armstrongChecker(num)){
            System.out.println(num + " is a Armstrong Number");
        }
        else{
            System.out.println(num + " is not a Armstrong Number");
        }
        scan.close();
    }
    public static boolean armstrongChecker(int num){
        int sum = 0;
        int originalNum = num;
        int power = countDigits(num);
        while(num > 0){
            int digit = num % 10;
            num /= 10;
            sum = sum + pow(digit, power);
            // comparison after loop because after this all digits with raised power are summed up
        }
        return originalNum == sum;
    }
    public static int countDigits(int num){
        int count = 0;
        while(num > 0){
            num /= 10;
            count ++;
        }
        return count;
    }
    public static int pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while(i < num2){
            result *= num1;
            i++;
        }
        return result;
    }
}
