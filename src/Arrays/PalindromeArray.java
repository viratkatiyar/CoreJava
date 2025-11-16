package Arrays;

import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int sizeOfArray = scan.nextInt();
        System.out.print("Enter " + sizeOfArray + " elements of Array : ");
        int[] myArray = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            myArray[i] = scan.nextInt();
        }
        if (isPalindrome(myArray)) {
            System.out.println("Array is Palindrome");
        } else {
            System.out.println("Array is not Palindrome");
        }
        scan.close();
    }
    public static boolean isPalindrome(int[] myArray){
        for (int i = 0; i < myArray.length / 2; i++) {
            if(myArray[i] != myArray[(myArray.length - 1) - i]){
                return false;
            }
        }
        return true;
    }
}
