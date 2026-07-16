import java.util.TreeSet;

public class Program122_TreeSetIntroduction {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(30);
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(30); // Duplicate

        System.out.println(numbers);

    }
}