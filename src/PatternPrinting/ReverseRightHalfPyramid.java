package Patterns;

import java.util.Scanner;

public class ReverseRightHalfPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No. of rows to print reverse right half Pyramid : ");
        int rows = scan.nextInt();
        System.out.println(rows + " rows Reverse Right Half Pyramid : ");
        reverseRightHalfPyramid(rows);
    }
    public static void reverseRightHalfPyramid(int rows){
        for(int i = rows; i >= 1; i--){
           for(int j = i;j > 0; j--){
               System.out.print("*\t");
           }
           System.out.println();
        }
    }
}
