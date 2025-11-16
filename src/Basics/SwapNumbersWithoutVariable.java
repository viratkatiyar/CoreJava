package Basics;

import java.util.Scanner;

public class SwapNumbersWithoutVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();
        System.out.println("Original num1 : " + num1 + " & num2 : " + num2);
        num1 = num1 + num2; // a = a + b
        num2 = num1 - num2; // b = a - b  (a = a + b) then a - b == b
        num1 = num1 - num2; // a = a - b  (a = a + b and b == a)
        System.out.println("Swapped num1 : " + num1 + " & num2 : " + num2);
    }
}
