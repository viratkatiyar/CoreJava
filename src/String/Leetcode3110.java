package String;

import java.util.Scanner;

public class Leetcode3110 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String in small case to get its score : ");
        String s = scan.next();
        System.out.println("Score : " + scoreOfString(s));
    }
    public static int scoreOfString(String s) {
            int score = 0;
            for(int i = 0; i < s.length() - 1; i++){
                int a = s.charAt(i);
                int b = s.charAt(i + 1);
                score += Math.abs(a - b);
            }
            return score;
    }
}
