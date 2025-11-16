package NumberSystem;

import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int n1 = scan.nextInt();
        System.out.print("Enter Number 2 : ");
        int n2 = scan.nextInt();
        System.out.print("Enter base of n1 and n2 : ");
        int base = scan.nextInt();
        System.out.println("Addition of " + n1 + "&" + n2 + " with base " + base + " = " + baseAddition(n1, n2, base));
    }
    public static int baseAddition(int n1, int n2, int b){
        int addition = 0;
        int carry = 0;
        int power = 1;
        while(n1 > 0 || n2 > 0 || carry > 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;
            int d = d1 + d2 + carry;
            carry = d / b;
            d = d % b;
            addition += d * power;
            power *= 10;
        }
        return addition;
    }
}
