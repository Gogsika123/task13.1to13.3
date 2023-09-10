import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class Task13_3 {
    public static void sort(ArrayList<Number> list) {
        List<Double> temp = new ArrayList<>();
        for (Number number : list) {
            temp.add(number.doubleValue());
        }
        Collections.sort(temp);
        list.clear();
        for (Double number : temp) {
            list.add(number);
        }
    }
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2.5);
        numbers.add(10);
        numbers.add(1.0);

        System.out.println("Before sorting: " + numbers);
        sort(numbers);
        System.out.println("After sorting: " + numbers);
    }

}