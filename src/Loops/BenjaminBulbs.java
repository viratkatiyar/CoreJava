package Loops;

import java.util.Scanner;

public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No. of Bulbs : ");
        int n = scan.nextInt();
        System.out.print("ON bulbs after " + n + " fluctuations : ");
        benjaminBulbs(n);
    }
    public static void benjaminBulbs(int n){
        for(int i = 1; i * i <= n; i++){
            System.out.print(i * i + " ");
        }

    }
}
