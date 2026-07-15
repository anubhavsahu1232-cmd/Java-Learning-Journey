import java.util.*;

public class Program101_LinkedListTraversal {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Anubhav");
        list.add("Rahul");
        list.add("Aman");
        list.add("Rohit");

        // 1. Normal For Loop
        System.out.println("Using Normal For Loop:");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 2. Enhanced For Loop
        System.out.println("\nUsing Enhanced For Loop:");

        for (String name : list) {
            System.out.println(name);
        }

        // 3. Iterator
        System.out.println("\nUsing Iterator:");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 4. ListIterator (Forward)
        System.out.println("\nUsing ListIterator (Forward):");

        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // 5. ListIterator (Backward)
        System.out.println("\nUsing ListIterator (Backward):");

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}