package exercises;
import java.util.ArrayList;

public class PrintString {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("color");
        words.add("blue");
        words.add("green");
        words.add("red");
        words.add("tiny");
        words.add("rings");

        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
