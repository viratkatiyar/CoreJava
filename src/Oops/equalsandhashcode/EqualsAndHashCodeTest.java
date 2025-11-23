package Oops.equalsandhashcode;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person p1 = new Person("Prashant", 31, "001");
        Person p2 = new Person("Prashant", 30, "001");

        if(p1.equals(p2)){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }
    }
}
