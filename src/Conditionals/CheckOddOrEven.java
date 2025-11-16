package Conditionals;

import java.util.Scanner;

public class CheckOddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Integer to Check If it is Even or Odd : ");
        int myNum = scan.nextInt();
        if(myNum % 2 == 0){
            System.out.println(myNum + " is Even");
        }
        else{
            System.out.println(myNum + " is Odd");
        }
    }
}
