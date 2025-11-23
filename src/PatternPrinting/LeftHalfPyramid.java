package Patterns;

import java.util.Scanner;

public class LeftHalfPyramid {
    public static void main(String[] args) {
        System.out.println("Enter Number of rows to print left half Pyramid : ");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        System.out.println(rows + " rows left half Pyramid : ");
        leftHalfPyramid(rows);
    }
    public static void leftHalfPyramid(int rows){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= rows - i; j++){
                System.out.print("\t");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
