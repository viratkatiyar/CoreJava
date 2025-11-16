package Patterns;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No. of Rows : ");
        int rows = scan.nextInt();
        printPascalTriangle(rows);
    }
    public static void printPascalTriangle(int n){
        for(int i = 0; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print("\t");
            }
            for(int j = 0; j <= i; j++){
                int icj = fact(i) / (fact(j) * fact(i - j));
                System.out.print(icj + "\t\t");
            }
            System.out.println();
        }
    }
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int myFact = 1;
        for(int i = 1; i <= n; i++){
            myFact *= i;
        }
        return myFact;
    }
}
