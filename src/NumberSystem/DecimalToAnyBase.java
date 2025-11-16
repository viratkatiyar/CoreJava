package NumberSystem;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = scan.nextInt();
        System.out.print("Enter base : ");
        int base = scan.nextInt();
        System.out.println("Decimal Number : " + num + " to " + base + " Base : " + decimalToBase(num, base));
    }
    public static int decimalToBase(int n, int b){
        int value = 0;
        int power = 1;
        while(n > 0){
            int temp = n % b;
            n /= b;
            value += temp * power;
            power *= 10;
        }
        return value;
    }
}
