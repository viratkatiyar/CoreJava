package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class SumOfAllPositiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Length Of Array : ");
        int length = scan.nextInt();
        int[] myArray = new int[length];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scan.nextInt();
        }
        System.out.println("Input Array : " + Arrays.toString(myArray));
        System.out.println("Sum of All Positive Integers in Array : " + sumPositive(myArray));
    }
    public static int sumPositive(int[] myArray){
        int sum = 0;
        for(int k : myArray){
            if(k <= 0){
                continue;
            }
            sum += k;
        }
        return sum;
    }
}
