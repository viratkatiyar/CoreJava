package Basics;

public class PatternUsingPrintStatement {
    public static void main(String[] args) {

        //Pattern 1 - Right Half Pyramid
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");
        System.out.println(); // System.out.println execute itself first then moves pointer to next line

        //Pattern 2 - Reverse Right Half Pyramid
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");


        //Pattern 3 - Left Half Pyramid
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");

    }
}
