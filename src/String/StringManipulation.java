package String;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        // Take two strings, concatenate them, and convert the result to uppercase
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st Word : ");
        String str1 = scan.next();
        System.out.print("Enter 2nd Word : ");
        String str2 = scan.next();

        System.out.printf("Concatenated and Uppercased String : %S", str1 + str2);
        System.out.println();
        System.out.println(str1.concat(" ").concat(str2).toUpperCase());
    }
}
