package Conditionals;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Year to Check if it is Leap Year or Not : ");
        int year = scan.nextInt();
        // Leap Year
        // it is divisible by 4, but not divisible by 100 unless it is also divisible by 400

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is a Leap Year");
        }
        else{
            System.out.println(year + " is not a Leap Year");
        }
        scan.close();
    }
}
