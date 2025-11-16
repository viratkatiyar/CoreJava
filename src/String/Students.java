package String;

public class Students {
    String name;
    int age;
    Students(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student Details : {name : " + name + ", age : " + age + "}";
    }

    public static void main(String[] args) {
        Students s1 = new Students("Virat", 21);
        Students s2 = new Students("Amar", 20);
        System.out.println(s1);
        System.out.println(s2);
    }
}
