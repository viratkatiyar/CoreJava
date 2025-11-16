package Loops;

import java.util.Scanner;

public class DoWhileQuestions {
    public static void main(String[] args) {
        //Create a program using do-while to find password checker until a valid password is entered
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Password Checker");
        String password = "virat";
        String pass;
        do {
            System.out.println("Enter password : ");
            pass = scan.nextLine();
        } while (!pass.equals(password));
        System.out.println("Right Password");

        //Create a program using do-while to implement a number guessing game
        System.out.println("Welcome to Number Guessing Game");
        int number = 8;
        int guessedNum;
        do{
            System.out.println("Enter Number Between 1 - 10");
            guessedNum = scan.nextInt();
        }while(number != guessedNum);
        System.out.println("Guessed Successfully");
    }
}
