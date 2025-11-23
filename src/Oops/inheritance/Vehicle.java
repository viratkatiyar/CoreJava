package Oops.inheritance;

public class Vehicle {
    private int numberOfTyres;
    public void setNumberOfTyres(int numberOfTyres){
        this.numberOfTyres = numberOfTyres;
    }
    public void commute(){
        System.out.printf("I am going from Place to Place B using %d tyres\n", numberOfTyres);
    }
}
