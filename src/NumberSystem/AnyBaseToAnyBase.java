package NumberSystem;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of Base 1 : ");
        int num = scan.nextInt();
        System.out.println("Enter Base of Number : ");
        int b1 = scan.nextInt();
        System.out.println("Enter Base of Number 2 : ");
        int b2 = scan.nextInt();
        System.out.println(num + " with base " + b1 + " = " + anyBaseToBase(num, b1, b2) + " with base " + b2);
    }
    public static int anyBaseToBase(int n, int b1, int b2){
        int decimal = 0;
        int power = 1;
        while(n > 0){
            int digit = n % 10;
            decimal += digit * power;
            n /= 10;
            power *= b1;
        }
        int newNum = 0;
        int power2 = 1;
        while(decimal > 0){
            int digit = decimal % b2;
            newNum += digit * power2;
            decimal /= b2;
            power2 *= 10;
        }
        return newNum;
    }
}
