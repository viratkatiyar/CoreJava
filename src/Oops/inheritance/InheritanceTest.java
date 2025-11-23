package Oops.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.commute();


        TwoWheeler two = new TwoWheeler();
        two.commute();// two-wheeler (two) also has v1 properties due to inheritance properties
        two.balance();

        MotorCycle m1 = new MotorCycle();
        m1.commute();
        m1.balance();
        System.out.println(m1.petrolCapacity);
        m1.start();
    }
}
