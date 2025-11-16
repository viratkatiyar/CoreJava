package Loops;

import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 1; i <= t; i++){
            int n = scan.nextInt();
            int count  = 0;
            for(int j = 2; j * j <= n; j++){ // optimized approach
                if(n % j == 0){
                    count ++;
                    break;
                }
            }
            if(count == 0){
                System.out.println("Prime");
            }
            else{
                System.out.println("not Prime");
            }
        }
    }
}
