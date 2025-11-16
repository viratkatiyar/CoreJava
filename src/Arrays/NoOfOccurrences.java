package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NoOfOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int sizeOfArray = scan.nextInt();
        System.out.print("Enter " + sizeOfArray + " elements of Array : ");
        int[] myArray = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            myArray[i] = scan.nextInt();
        }
        System.out.print("Enter Element to Find number of Occurrences : ");
        int element = scan.nextInt();
        System.out.println("No of Occurrences of " + element + " in " + Arrays.toString(myArray) + " : " + noOfOccurrences(element, myArray));
    }
    public static int noOfOccurrences(int element, int[] myArray){
        int occ = 0;
        for (int j : myArray) {
            if (j == element) occ++;
        }
        return occ;
    }
}
