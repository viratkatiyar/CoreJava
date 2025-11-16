package Conditionals;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = scan.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = scan.nextInt();
        System.out.println("Enter num3 : ");
        int num3 = scan.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is Greatest");
        }
        else if(num2 >= num3){
            System.out.println(num2 + " is Greatest");
        }
        else {
            System.out.println(num3 + " is Greatest");
        }
    }
}
