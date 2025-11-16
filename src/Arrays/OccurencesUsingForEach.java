package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OccurencesUsingForEach {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Length Of Array : ");
        int length = scan.nextInt();
        int[] myArray = new int[length];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scan.nextInt();
        }
        System.out.println("Enter Element to find its occurences : ");
        int element = scan.nextInt();
        System.out.println("Number of Occurences of Element " + element + " = " + occurences(myArray, element) + " in the Array : " + Arrays.toString(myArray));
    }
    public static int occurences(int[] myArray, int element){
        int occ = 0;
        for(int k : myArray){
            if(k == element){
                occ ++;
            }
        }
        return occ;
    }
}
