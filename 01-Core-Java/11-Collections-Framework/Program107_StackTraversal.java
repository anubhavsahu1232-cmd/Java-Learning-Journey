import java.util.*;

public class Program107_StackTraversal {

    public static void main(String[] args) {

        Stack<String> books = new Stack<>();

        books.push("Java");
        books.push("Python");
        books.push("C++");
        books.push("JavaScript");

        // 1. Normal For Loop
        System.out.println("Using Normal For Loop:");

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }

        // 2. Enhanced For Loop
        System.out.println("\nUsing Enhanced For Loop:");

        for (String book : books) {
            System.out.println(book);
        }

        // 3. Iterator
        System.out.println("\nUsing Iterator:");

        Iterator<String> iterator = books.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 4. ListIterator
        System.out.println("\nUsing ListIterator:");

        ListIterator<String> listIterator = books.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}