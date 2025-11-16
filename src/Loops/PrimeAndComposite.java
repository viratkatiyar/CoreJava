package Loops;

import java.util.Scanner;

public class PrimeAndComposite {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to check if it is a prime or composite : ");
        //PrimeAndComposite is a number greater than 1 and has two factors 1 and itself
        //Composite ia a number greater than 1 and has more than two factors
        int num = scan.nextInt();
        if(num <= 1){
            System.out.println(num + " is neither Prime nor Composite");
        }
        else{
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(num); i++){ // can use < num but this will increase number of iterations
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num + " is a Prime");
            }
            else{
                System.out.println(num + " is not a Prime but a composite");
            }
            // second
            if(PrimeChecker(num)){
                System.out.println(num + " is a Prime");
            }
            else{
                System.out.println(num + " is not a Prime but a composite");
            }
        }
    }
    public static boolean PrimeChecker(int num){
        int i = 2;
        while(i < num){ // less optimized approach
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
