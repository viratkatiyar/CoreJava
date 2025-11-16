package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int sizeOfArray = scan.nextInt();
        System.out.print("Enter " + sizeOfArray + " elements of Array : ");
        int[] myArray = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            myArray[i] = scan.nextInt();
        }
        System.out.print("Enter element to delete : ");
        int element = scan.nextInt();
        if(noOfOccurrences(element, myArray) > 0){
            System.out.println("New Array after deleting element : " + element + " = " + Arrays.toString(deleteElement(myArray, element)));
        }
        else{
            System.out.println("Element not Found");
            System.out.print(Arrays.toString(myArray));
        }
    }
    public static int noOfOccurrences(int element, int[] myArray){
        int occ = 0;
        for (int j : myArray) {
            if (j == element) occ++;
        }
        return occ;
    }

    public static int[] deleteElement(int[] myArray, int element) {
        int[] newArray = new int[myArray.length - noOfOccurrences(element, myArray)];
        int j = 0;
        for (int k : myArray) {
            if (k != element) {
                newArray[j++] = k; // j++ because first we will use that value then we update if element is not found equal
            }
        }
        return newArray;
    }
}
