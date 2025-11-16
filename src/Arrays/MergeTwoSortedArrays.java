package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of First Array : ");
        int size1 = scan.nextInt();
        int[] myArray1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter " + i + "th Element of First Array : ");
            myArray1[i] = scan.nextInt();
        }
        System.out.println("First Array : " + Arrays.toString(myArray1));
        System.out.print("Enter size of Second Array : ");
        int size2 = scan.nextInt();
        int[] myArray2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter " + i + "th Element of Second Array : ");
            myArray2[i] = scan.nextInt();
        }
        System.out.println("Second Array : " + Arrays.toString(myArray2));
        System.out.println("Result : " + Arrays.toString(mergeTwoSortedArrays(myArray1, myArray2)));
    }
    public static int[] mergeTwoSortedArrays(int[] myArray1, int[] myArray2){
        int size = myArray1.length + myArray2.length;
        int[] newArray = new int[size];
        int i = 0, j = 0, k = 0;
        // copying elements until one array becomes zero
        while(i < myArray1.length && j < myArray2.length){
            if(myArray1[i] < myArray2[j]){
                newArray[k++] = myArray1[i++];
            }
            else{
                newArray[k++] = myArray2[j++];
            }
        }
        while(i < myArray1.length){
            newArray[k++] = myArray1[i++];
        }
        while(j < myArray2.length){
            newArray[k++] = myArray2[j++];
        }
        return newArray;
    }
}
