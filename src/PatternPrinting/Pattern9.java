package Patterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = scan.nextInt();
        printPattern9(rows);
    }
    public static void printPattern9(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if((i + j == n + 1) || (i == j)){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
