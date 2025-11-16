package Patterns;

import java.util.Scanner;

public class RightHalfPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no. of Rows to print for right Half Pyramid : ");
        int rows = scan.nextInt();
        System.out.println("Right Half Pyramid having " + rows + " rows : ");
        rightHalfPyramid(rows);
    }
    public static void rightHalfPyramid(int rows){
        int i = 1;
        while(i <= rows){
            for(int j = 1; j <= i; j++){
                System.out.print("*\t");
            }
            System.out.println();
            i++;
        }
    }
}
