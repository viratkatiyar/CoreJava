package Basics;

import java.util.Scanner;

public class MinOfFourNumbersInOneLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n1 : ");
        int n1 = scan.nextInt();
        System.out.println("Enter n2 : ");
        int n2 = scan.nextInt();
        System.out.println("Enter n3 : ");
        int n3 = scan.nextInt();
        System.out.println("Enter n4 : ");
        int n4 = scan.nextInt();

        System.out.println("Min : " + Math.min(Math.min(n1, n2), Math.min(n3, n4)));

    }
}
