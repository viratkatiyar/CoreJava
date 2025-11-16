package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CheckSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int sizeOfArray = scan.nextInt();
        System.out.print("Enter " + sizeOfArray + " elements of Array : ");
        int[] myArray = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            myArray[i] = scan.nextInt();
        }
        if (checkSortIncrease(myArray)) {
            System.out.println(Arrays.toString(myArray) + " is Sorted in Increasing Order");
        } else if (checkSortDecrease(myArray)) {
            System.out.println(Arrays.toString(myArray) + " is Sorted in Decreasing Order");
        } else {
            System.out.println(Arrays.toString(myArray) + " is not Sorted");
        }
    }
    public static boolean checkSortIncrease(int[] myArray){
        for (int i = 0; i < myArray.length - 1; i++) {
            if(myArray[i] > myArray[i + 1]){
                return false;
            }
        }
        return true;
    }
    public static boolean checkSortDecrease(int[] myArray){
        for (int i = 0; i < myArray.length - 1; i++) {
            if(myArray[i] < myArray[i + 1]){
                return false;
            }
        }
        return true;
    }
}
