package Loops;

import java.util.Scanner;

public class GcdAndLcm {
    public static void main(String[] args) {
        System.out.print("Enter num1 : ");
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        System.out.print("Enter num2 : ");
        int n2 = scan.nextInt();

        int temp1 = n1;
        int temp2 = n2;
        while(n1 % n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;
        int lcm = (temp1 * temp2) / gcd;
        System.out.print("LCM : " + lcm + "\nGCD : " + gcd);
    }
}
