package Oops.inheritance;

public class TestArrayOperations {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[]{1, 2, 3, 4});
        ArrayOperations.Statistics stat = opr.new Statistics();
        System.out.println(stat.mean());
        System.out.println(stat.median());
    }
}
