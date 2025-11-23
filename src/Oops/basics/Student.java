package Oops.basics;

public class Student {
    // Instance Variables
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;   // 'this' refers to current object
        this.age = age;
    }

    // Instance Method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Virat", 20);
        Student s2 = new Student("Karan", 22);

        s1.display();  // uses s1's instance variables
        s2.display();  // uses s2's instance variables
    }
}
