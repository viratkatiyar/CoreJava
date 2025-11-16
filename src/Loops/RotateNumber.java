package Loops;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number to rotate : ");
        int num = scan.nextInt();
        System.out.println("Enter rotation number : ");
        int rotation = scan.nextInt();
        System.out.print("Rotation of " + num + " by " + rotation + " : " + rotateNumber(num, rotation));
        scan.close();
    }
    public static int rotateNumber(int num, int rotation){
        rotation = rotation % countDigits(num);
        if(rotation < 0){
            rotation += countDigits(num);
        }
        int div = 1;
        int mul = 1;
        for(int i = 1; i <= countDigits(num); i++){
            if(i <= rotation){
                div *= 10;
            }
            else{
                mul *= 10;
            }
        }
        int q = num / div;
        int r = num % div;
        return r * mul + q;
    }
    public static int countDigits(int num){
        if (num == 0){
            return 1;
        }
        int digits = 0;
        while(num != 0){
            num /= 10;
            digits ++;
        }
        return digits;
    }
}
