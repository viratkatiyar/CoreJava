package String;

public class WordsArrayConcatenate {
    public static void main(String[] args) {
        String[] arr = new String[]{
            "Virat", "is", " the", "king", "of", "dsa"
        };
        StringBuilder str;
        str = new StringBuilder();
        for(String k : arr){
            str.append(k).append(" ");
        }
        System.out.println(str);
    }
}
