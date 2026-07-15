import java.util.Vector;

public class Program103_VectorBasicMethods {

    public static void main(String[] args) {

        Vector<String> students = new Vector<>();

        // add()
        students.add("Anubhav");
        students.add("Rahul");
        students.add("Aman");

        System.out.println("Original Vector : " + students);

        // get()
        System.out.println("Element at Index 1 : " + students.get(1));

        // set()
        students.set(1, "Rohit");
        System.out.println("After set() : " + students);

        // remove()
        students.remove(2);
        System.out.println("After remove() : " + students);

        // contains()
        System.out.println("Contains Anubhav : "
                + students.contains("Anubhav"));

        // size()
        System.out.println("Size : " + students.size());

        // firstElement()
        System.out.println("First Element : "
                + students.firstElement());

        // lastElement()
        System.out.println("Last Element : "
                + students.lastElement());

        // capacity()
        System.out.println("Capacity : "
                + students.capacity());

        // isEmpty()
        System.out.println("Is Empty : "
                + students.isEmpty());

        // clear()
        students.clear();

        System.out.println("After clear() : " + students);
    }
}