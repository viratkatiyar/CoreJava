package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int sizeOfArray = scan.nextInt();
        System.out.print("Enter " + sizeOfArray + " elements of Array : ");
        int[] myArray = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            myArray[i] = scan.nextInt();
        }
        System.out.println("Input Array : " + Arrays.toString(myArray));
        System.out.println("Reversed Array : " + Arrays.toString(reverseArray(myArray)));
    }
    public static int[] reverseArray(int[] myArray){
        int[] newArray = new int[myArray.length];
        int j = 0;
        for (int i = 0; i < myArray.length; i++) {
            newArray[j++] = myArray[(myArray.length - 1) - i];
        }
        return newArray;
    }
    // Reverse array without creating a new one
    public static int[] reverseArray2(int[] myArray){
        for (int i = 0; i < myArray.length / 2; i++) {
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[(myArray.length - 1) - i] = temp;
        }
        return myArray;
    }
}
