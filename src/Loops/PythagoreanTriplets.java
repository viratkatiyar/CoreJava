package Loops;

import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        System.out.println("Enter sides of triangle to check whether it is right- angled or not : ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Side :");
        int firstSide = scan.nextInt();
        System.out.print("Enter Second Side :");
        int secondSide = scan.nextInt();
        System.out.print("Enter Third Side :");
        int thirdSide = scan.nextInt();
        if(rightAngledTriangle(firstSide, secondSide, thirdSide)){
            System.out.println("Right Angled Triangle Is Formed");
        } else{
            System.out.println("Right Angled Triangle not Formed");
        }
        scan.close();
    }
    public static boolean rightAngledTriangle(int n1, int n2, int n3){
        int max = n1;
        if(n2 >= max){
            max = n2;
        }
        if(n3 >= max){
            max = n3;
        }
        boolean check = false;
        if(max == n1){
            check = (n1 * n1 == (n2 * n2 + n3 * n3));
        } else if (max == n2) {
            check = (n2 * n2 == (n1 * n1 + n3 * n3));
        } else{
            check = (n3 * n3 == (n1 * n1 + n2 * n2));
        }
        return check;
    }
}
