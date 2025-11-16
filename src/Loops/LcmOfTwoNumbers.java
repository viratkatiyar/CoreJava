package Loops;

import java.util.Scanner;

public class LcmOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Lcm of two numbers is smallest positive number that is a multiple of both numbers
        // gcd(hcf) of two numbers is greatest positive number that divides both numbers
        System.out.println("Enter First Number : ");
        int num1 = scan.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = scan.nextInt();
        System.out.println("LCM of " + num1 + " & " + num2 + " : " + lcm(num1, num2));
        System.out.println("GCD of " + num1 + " & " + num2 + " : " + gcd(num1, num2));
    }

    public static int lcm(int num1, int num2) {
        int lcm = Math.max(num1, num2); //int lcm = (num1 > num2) ? num1 : num2;
        // Find the larger number manually
//        if (num1 > num2) {
//            lcm = num1;
//        } else {
//            lcm = num2;
//        }
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                return lcm; //can use break when not using method
            }
            lcm++;
        }
    }

    public static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static int lcm2(int num1, int num2) {
        int i = 1;
        while (true) {
            int factor = num1 * i;
            if (factor % num2 == 0) {
                return factor;
            }
            i++;
        }
    }
    public static int gcd2(int num1, int num2){
        int gcd = 1;
        int i = 2;
        int least = Math.min(num1, num2);
        while(i <= least){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
}