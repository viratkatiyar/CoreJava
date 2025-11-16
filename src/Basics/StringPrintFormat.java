package Basics;

public class StringPrintFormat {
    public static void main(String[] args) {
        String name = "Virat";
        int marks = 45;
        System.out.println("Hello " + name + ", your marks are : " + marks);
        System.out.printf("Hello %10S, your marks are : %d", name, marks);
    }
}
