package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxElementOfArray {
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
        int max = myArray[0];
        int min = myArray[0];
        for (int j : myArray) {
            if (j > max) max = j;
            if (j < min) min = j;
        }
        System.out.println("Min. & Max. Element of " + Arrays.toString(myArray) + " are " + min + " and " + max + " respectively");
    }
}
