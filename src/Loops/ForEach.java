package Loops;

public class ForEach {
    public static void main(String[] args) {
        String[] array = new String[]{
                "Virat", "Katiyar", "Don", "Baba"
        };
        printArray(array);
    }
    public static void printArray(String[] array){
        for(String name : array){
            System.out.print(name + " ");
        }
    }
}
