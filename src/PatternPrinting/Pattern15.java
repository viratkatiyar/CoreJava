package Patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = scan.nextInt();
        printPattern15(rows);
    }
    public static void printPattern15(int n){
        int st = 1;
        int sp = n / 2;
        int temp = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            int val = temp;
            for(int j = 1; j <= st; j++){
                    System.out.print(val + "\t");
                    if(j <= st / 2){
                        val ++;
                    }
                    else{
                        val --;
                    }
                }
            if(i <= n / 2){
                sp --;
                st += 2;
                temp ++;
            }
            else{
                sp ++;
                st -= 2;
                temp --;
            }
            System.out.println();
        }
    }
}