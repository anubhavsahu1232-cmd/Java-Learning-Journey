import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Program110_QueueTraversal {

    public static void main(String[] args) {

        Queue<String> students = new LinkedList<>();

        students.offer("Anubhav");
        students.offer("Rahul");
        students.offer("Aman");
        students.offer("Rohit");

        // 1. Enhanced For Loop
        System.out.println("Using Enhanced For Loop:");

        for (String student : students) {
            System.out.println(student);
        }

        // 2. Iterator
        System.out.println("\nUsing Iterator:");

        Iterator<String> iterator = students.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 3. Normal For Loop
        System.out.println("\nUsing Normal For Loop:");

        Object[] array = students.toArray();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}