import java.util.Iterator;
import java.util.PriorityQueue;

public class Program113_PriorityQueueTraversal {

    public static void main(String[] args) {

        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.offer(30);
        numbers.offer(10);
        numbers.offer(50);
        numbers.offer(20);

        // 1. Enhanced For Loop
        System.out.println("Using Enhanced For Loop:");

        for (Integer number : numbers) {
            System.out.println(number);
        }

        // 2. Iterator
        System.out.println("\nUsing Iterator:");

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 3. toArray()
        System.out.println("\nUsing toArray():");

        Object[] array = numbers.toArray();

        for (Object value : array) {
            System.out.println(value);
        }

    }
}