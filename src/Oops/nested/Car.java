package Oops.nested;

public class Car {

    public void repair(){
        Tyre t = new Tyre();
    }
    protected static class Tyre {
        private double width;
        private double pressure;
        private String material;

        public void inflate(){
            int noOfDoors = 4;
        }
    }
}
