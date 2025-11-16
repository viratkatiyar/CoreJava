package Basics;

import java.util.Scanner;

public class PalindromeUsingRecursion {
    public static void main(String[] args) {
        System.out.println("Enter String to check if it is a Palindrome or Not : ");
        Scanner sc = new Scanner(System.in);
        String myStr = sc.next();
        boolean checker = palindrome(myStr);
        System.out.println(myStr + " : " + (palindrome(myStr) ? "Palindrome" : "Not a Palindrome"));
    }
    public static boolean palindrome(String myStr){
        if(myStr.length() <= 1){
            return true;
        }
        if(myStr.charAt(0) != myStr.charAt(myStr.length() - 1)){
            return false;
        }
        String subString = myStr.substring(1, myStr.length() - 1);
        return palindrome(subString);
    }
}
