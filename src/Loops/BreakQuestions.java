package Loops;

import java.util.Scanner;

public class BreakQuestions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter keyword - exit to terminate the loop");
        while(true){
            System.out.println("Enter your Keyword : ");
            String keyword = scan.nextLine();
            if(keyword.equals("exit")){
                break;
            }
        }
        System.out.println("Exit Successful");
    }
}
