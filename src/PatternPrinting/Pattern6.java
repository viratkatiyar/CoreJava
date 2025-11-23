package Patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = scan.nextInt();
        printPattern6(rows);
    }
    public static void printPattern6(int n){
        int st = n / 2 + 1;
        int sp = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= st; j ++){
                System.out.print("*\t");
            }
            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= st; j ++){
                System.out.print("*\t");
            }
            if(i <= n / 2){
                st --;
                sp += 2;
            }
            else{
                st ++;
                sp -= 2;
            }
            System.out.println();
        }
    }
}
