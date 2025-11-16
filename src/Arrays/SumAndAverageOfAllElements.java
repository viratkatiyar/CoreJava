package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumAndAverageOfAllElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int sizeOfArray = scan.nextInt();
        System.out.print("Enter " + sizeOfArray + " elements of Array : ");
        int[] myArray = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            myArray[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println("Sum of All Elements in Array : " + sumArray(myArray));
        System.out.println("Average of All Elements in Array : " + (double)sumArray(myArray)/sizeOfArray);
    }
    public static int sumArray(int[] myArray){
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        return sum;
    }
}
