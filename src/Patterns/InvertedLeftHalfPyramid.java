package Patterns;

import java.util.Scanner;

public class InvertedLeftHalfPyramid {
    public static void main(String[] args) {
        System.out.println("Enter Number of rows to print inverted left half Pyramid : ");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        System.out.println(rows + " rows inverted left half Pyramid : ");
        invertedLeftHalfPyramid(rows);
    }
    public static void invertedLeftHalfPyramid(int rows){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i - 1; j++){
                System.out.print("\t");
            }
            for(int k = 0; k <= rows - i; k++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
