package Basics;

import java.util.Scanner;

// This is nCr and nPr in Permutations and Combinations
public class NcRandNpR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = scan.nextInt();
        System.out.println("Enter r but (r <= n): ");
        int r = scan.nextInt();
        int nCr = fact(n) / (fact(n - r) * fact(r));
        int nPr = fact(n) / fact(n - r);
        System.out.println("n Choose r : " + nCr);
        System.out.println("nPr : " + nPr);
    }
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int myFact = 1;
        for(int i = 1; i <= n; i++){
            myFact *= i;
        }
        return myFact;
    }
}
