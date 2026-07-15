import java.util.*;

public class Program104_VectorTraversal {

    public static void main(String[] args) {

        Vector<String> students = new Vector<>();

        students.add("Anubhav");
        students.add("Rahul");
        students.add("Aman");
        students.add("Rohit");

        // 1. Normal For Loop
        System.out.println("Using Normal For Loop:");

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        // 2. Enhanced For Loop
        System.out.println("\nUsing Enhanced For Loop:");

        for (String student : students) {
            System.out.println(student);
        }

        // 3. Iterator
        System.out.println("\nUsing Iterator:");

        Iterator<String> iterator = students.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 4. ListIterator
        System.out.println("\nUsing ListIterator:");

        ListIterator<String> listIterator = students.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // 5. Enumeration
        System.out.println("\nUsing Enumeration:");

        Enumeration<String> enumeration = students.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}