import java.util.ArrayList;// task 13.2
import java.util.Collections;
public class Shuffle {
    public static void shuffle(ArrayList<Number> list) {
        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("LIst before shuffling: " + numbers);
        shuffle(numbers);
        System.out.println("Shuffled List: " + numbers);
    }
}

