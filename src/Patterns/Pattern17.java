package Patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = scan.nextInt();
        printPattern17(rows);
    }
    public static void printPattern17(int n) {
        int st = 1;
        int sp = n / 2;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sp; j++){
                if(i == n / 2 + 1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            for(int j = 1; j <= st; j++){
                System.out.print("*\t");
            }
            if(i <= n/2){
                st ++;
            }
            else{
                st --;
            }
            System.out.println();
        }
    }
}
