package Basics;

import java.util.Scanner;

public class MaxOfThreeUsingBuiltInFunctions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n1 : ");
        int n1 = scan.nextInt();
        System.out.println("Enter n2 : ");
        int n2 = scan.nextInt();
        System.out.println("Enter n3 : ");
        int n3 = scan.nextInt();
        System.out.println("Max : " + Math.max(n1, Math.max(n2, n3)));
    }
}
