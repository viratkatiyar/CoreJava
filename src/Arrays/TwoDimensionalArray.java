package Arrays;
import java.util.Scanner;
public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = scan.nextInt();
        int[][] myArray = new int[rows][];

        // Input the 2D Array
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter length of " + i +"th element : ");
            int columns = scan.nextInt();
            myArray[i] = new int[columns];
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter myArray[" + i + "][" + j + "] element : ");
                myArray[i][j] = scan.nextInt();
            }
        }

        // Printing 2D Array
        System.out.println("\n2D Array is :");
        for (int[] ints : myArray) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

        // Searching Element in 2D Array
        System.out.print("\nEnter element to search: ");
        int element = scan.nextInt();
        boolean found = false;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                sum += myArray[i][j];
                count ++;
                if (myArray[i][j] == element) {
                    System.out.println("Element " + element + " found at [" + i + "][" + j + "]");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }
        if (count > 0) {
            System.out.println("Sum and Average of all Elements in 2D array are : "
                + sum + "\n" + (float) sum / count + " respectively");
        } else {
            System.out.println("Array is empty. Sum and Average cannot be calculated.");
        }

        // Sum of Diagonal Elements (for this rows & columns should be same for each row)
        boolean isSquare = true;
        for (int[] arr : myArray) {
            if (arr.length != rows) {
                isSquare = false;
                break;
            }
        }

        if (isSquare) {
            int sumDiagonal = 0;
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray[i].length; j++) {
                    if (i == j || (i + j == myArray.length - 1)) {
                        sumDiagonal += myArray[i][j];
                    }
                }
            }
            System.out.println("Sum of Diagonals : " + sumDiagonal);
        } else {
            System.out.println("Sum of Diagonals is not Possible");
        }
    }
}
