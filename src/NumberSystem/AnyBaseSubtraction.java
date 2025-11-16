package NumberSystem;

import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int n1 = scan.nextInt();
        System.out.print("Enter Number 2 : ");
        int n2 = scan.nextInt();
        System.out.print("Enter base of n1 and n2 : ");
        int base = scan.nextInt();
        System.out.println("Subtraction of " + n1 + " & " + n2 + " with base " + base + " = " + baseSubtraction(n1, n2, base));
    }
    public static int baseSubtraction(int n1, int n2, int b){
        int subtraction = 0;
        int carry = 0;
        int power = 1;
        while(n2 > 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;
            int d = 0;
            d2 += carry;
            if (d2 >= d1){
                carry = 0;
                d = d2 - d1;
            }
            else {
                carry = -1;
                d = d2 + b - d1;
            }
            subtraction += d * power;
            power *= 10;
        }
        return subtraction;
    }
}
