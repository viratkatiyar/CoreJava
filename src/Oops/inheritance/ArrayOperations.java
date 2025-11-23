package Oops.inheritance;

public class ArrayOperations {
    int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }
    public class Statistics {
        double mean(){
            double sum = 0;
            for(int k : numbers){
                sum += k;
            }
            return sum / numbers.length;
        }
        double median(){
            return 0;
        }
    }
}
