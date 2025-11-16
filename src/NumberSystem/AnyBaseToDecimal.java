package NumberSystem;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of That Base : ");
        int num = scan.nextInt();
        System.out.println("Enter base : ");
        int base = scan.nextInt();
        System.out.println(num + " with Base : " + base + " = " + anyBaseToDecimal(num ,base));
    }
    public static int anyBaseToDecimal(int n, int b){
        int value = 0;
        int power = 1;
        while(n > 0){
            int digit = n % 10;
            value += digit * power;
            n /= 10;
            power *= b;
        }
        return value;
    }
}
