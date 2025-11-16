package Conditionals;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        //Create a program to find the minimum of two numbers
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Two Numbers Below to get Minimum Number -- ");
        System.out.print("Enter First Number  : ");
        int firstNum = scan.nextInt();
        System.out.print("Enter Second Number  : ");
        int secondNum = scan.nextInt();
        int minNumber = firstNum < secondNum ? firstNum : secondNum;
        System.out.println("Minimum Number : " + minNumber);

        //Create a program to find if the given number is even or odd
        System.out.print("Enter Number to check if it is odd or even : ");
        int checkNum = scan.nextInt();
        String oddOrEven = checkNum % 2 == 0 ? "Even" : "Odd";
        System.out.println(checkNum + " is " + oddOrEven);

        //Create a program to calculate the absolute value of a given integer
        System.out.print("Enter Number to get its absolute value : ");
        int givenInt = scan.nextInt();
        int absolute = givenInt > 0 ? givenInt : -givenInt;
        System.out.println("Absolute Value : " + absolute);

        //Create a program to Based on a student's score, categorize as "High", "Moderate", or "Low" using the ternary operator (e.g., High for scores > 80, Moderate for 50-80, Low for < 50)
        System.out.print("Enter Student score in Range (1 - 100) to check category as High, Low or Moderate : ");
        int studentScore = scan.nextInt();
        String categoryOfMarks = studentScore > 80 ? "High" : (studentScore > 50 ? "Moderate" : "Low");
        System.out.println("Category of Student Marks : " + categoryOfMarks);

        //Create a program to print the month of the year based on a number (1-12) input by the user
        System.out.print("Enter Number to get Month Name : ");
        int monthNum = scan.nextInt();
        String monthName = switch(monthNum){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Number";
        };
        System.out.println("Month of Number : " + monthName);

        //Create a program to create a simple calculator that uses a switch statement to perform basic arithmetic operations like addition, subtraction, multiplication, and division
        System.out.println("Welcome to Calculator : ");
        System.out.print("Enter First Number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = scan.nextInt();
        System.out.println("Enter the Operations (+, -, *, /) : ");
        String operation = scan.next();
        float result = switch (operation){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> (float) num1 / num2;
            default -> -1;
        };
        System.out.println(num1 + operation + num2 + " = " + result);
    }
}
