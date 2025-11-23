package Oops.inheritance;

public class TwoWheeler extends Vehicle {
    TwoWheeler(){
        setNumberOfTyres(2);
    }
    public void balance(){
        System.out.println("I am Balancing on two tyres");
    }
}
