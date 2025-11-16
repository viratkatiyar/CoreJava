package Conditionals;

import java.util.Scanner;

public class DetermineNumber {
    public static void main(String[] args) {
        System.out.println("Enter any Integer to check if it is positive, negative or zero : ");
        Scanner scan = new Scanner(System.in);
        int myNumber = scan.nextInt();
        if(myNumber == 0){
            System.out.println(myNumber + " is Zero");
        }
        else if(myNumber > 0){
            System.out.println(myNumber + " is Positive");
        }
        else{
            System.out.println(myNumber + " is Negative");
        }
    }
}
