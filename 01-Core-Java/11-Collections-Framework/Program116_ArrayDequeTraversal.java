import java.util.ArrayDeque;
import java.util.Iterator;

public class Program116_ArrayDequeTraversal {

    public static void main(String[] args) {

        ArrayDeque<String> adq = new ArrayDeque<>();

        adq.offer("Java");
        adq.offer("Python");
        adq.offer("C++");
        adq.offer("HTML");

        // 1. Enhanced For Loop
        System.out.println("Using Enhanced For Loop:");

        for (String language : adq) {
            System.out.println(language);
        }

        // 2. Iterator
        System.out.println("\nUsing Iterator:");

        Iterator<String> iterator = adq.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 3. Descending Iterator
        System.out.println("\nUsing Descending Iterator:");

        Iterator<String> reverseIterator = adq.descendingIterator();

        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

        // 4. toArray()
        System.out.println("\nUsing toArray():");

        Object[] array = adq.toArray();

        for (Object value : array) {
            System.out.println(value);
        }

    }
}