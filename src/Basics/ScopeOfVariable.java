package Basics;

public class ScopeOfVariable {
    static int i; //instance variable
    public static void main(String[] args) {
        i = 16;
        System.out.println(i);
        int i = 23; //local variable
        System.out.println(i);
        fun();
    }
    public static void fun(){
        System.out.println(i);
        int i = 70;
        System.out.println(i);
    }
}
