package Loops;

public class AsciiValues {
    public static void main(String[] args) {
        System.out.println("ASCII values and capital alphabets : ");
        int start = 'A';
        for(int i = start; i < start + 26; i++){
            System.out.println(i + "\t" + (char)i);
        }
    }
}
