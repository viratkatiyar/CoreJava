package Conditionals;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Marks to check Grade : ");
        int myMarks = scan.nextInt();

        if(myMarks > 90){
            System.out.println("Excellent");
        }
        else if(myMarks > 80){
            System.out.println("Good");
        }
        else if(myMarks > 70){
            System.out.println("Fair");
        }
        else if(myMarks > 60){
            System.out.println("Meets Expectations");
        }
        else{
            System.out.println("Poor");
        }
    }
}
