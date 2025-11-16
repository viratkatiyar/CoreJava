package Conditionals;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = scan.nextInt();
        int greaterNumber = num1 > num2 ? num1 : num2;
        System.out.println(greaterNumber + " is the greater Number");
    }
}
