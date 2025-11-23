package Oops.basics;
// Instance Methods and Variables
public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLitres;
    int noOfSeats;
    public Car start(){
        if(currentFuelInLitres == 0){
            System.out.println("Car is out of fuel");
        }
        else if(currentFuelInLitres < 5){
            System.out.println("Car is in reversed mode, please refuel");
        }
        else{
            System.out.println("Car is Started boom...");
        }
        return this;
    }
    public void drive(){
        currentFuelInLitres --;
        System.out.println("Car is Driving");
    }
    public void addFuel(float currentFuelInLitres){
        this.currentFuelInLitres += currentFuelInLitres;
    }
    public float getCurrentFuelLevel(){
        return currentFuelInLitres;
    }
}
