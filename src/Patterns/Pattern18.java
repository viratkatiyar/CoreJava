package Patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = scan.nextInt();
        printPattern18(rows);
    }
    public static void printPattern18(int n){
        int os = 0;
        int st = n;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= os; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= st; j++){
                if(j > 1 && j < st && i > 1 && i <= n / 2){
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }
            }
            if (i <= n / 2){
                os ++;
                st -= 2;
            }
            else{
                os --;
                st += 2;
            }
            System.out.println();
        }
    }
}
