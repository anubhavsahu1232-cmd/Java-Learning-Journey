import java.util.HashSet;
import java.util.Iterator;

public class Program119_HashSetTraversal {

    public static void main(String[] args) {

        HashSet<String> students = new HashSet<>();

        students.add("Anubhav");
        students.add("Rahul");
        students.add("Aman");
        students.add("Rohit");

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

        // 3. toArray()
        System.out.println("\nUsing toArray():");

        Object[] array = students.toArray();

        for (Object value : array) {
            System.out.println(value);
        }

    }
}