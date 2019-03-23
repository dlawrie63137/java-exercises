package exercises;
import java.util.ArrayList;

public class SumEvens {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Integer sum = 0;

        for (int i=0; i<10; i++) {
            numbers.add(i);
        }

        for (Integer num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("The sum of even numbers is " + sum);
    }
}




