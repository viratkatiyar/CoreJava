package Conditionals;

import java.util.Scanner;

public class ModernSwitchStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your day in Number : ");
        int day = scan.nextInt();
        String dayStr = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6,7 -> "Holiday";
            default -> "Invalid Day";
        };
        System.out.println(dayStr);
    }
}
