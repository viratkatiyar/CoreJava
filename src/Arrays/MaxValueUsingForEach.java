package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class MaxValueUsingForEach {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Length Of Array : ");
        int length = scan.nextInt();
        int[] myArray = new int[length];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scan.nextInt();
        }
        System.out.println("Input Array : " + Arrays.toString(myArray));
        System.out.println("Maximum Value in Array : " + maxValue(myArray));
    }
    public static int maxValue(int[] myArray){
        int max = myArray[0];
        for(int maxValue : myArray){
            if(maxValue > max){
                max = maxValue;
            }
        }
        return max;
    }
}
