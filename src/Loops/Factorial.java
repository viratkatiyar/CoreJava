package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number to get Factorial : ");
        int num = scan.nextInt();
        long myFact = 1;
        if(num == 0){
            System.out.println("Factorial of " + num + " : " + myFact);
        }
        else{
            for(int i = 1; i <= num; i++){
                myFact *= i;
            }
            System.out.println("Factorial of " + num + " : " + myFact);
        }

    }
}
