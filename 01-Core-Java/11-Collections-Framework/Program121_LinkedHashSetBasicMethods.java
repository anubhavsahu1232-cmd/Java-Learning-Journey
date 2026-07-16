import java.util.LinkedHashSet;

public class Program121_LinkedHashSetBasicMethods {

    public static void main(String[] args) {

        LinkedHashSet<String> students = new LinkedHashSet<>();

        // add()
        students.add("Anubhav");
        students.add("Rahul");
        students.add("Aman");
        students.add("Rahul"); // Duplicate

        System.out.println("Original LinkedHashSet : " + students);

        // remove()
        students.remove("Aman");
        System.out.println("After remove() : " + students);

        // contains()
        System.out.println("Contains Rahul : " + students.contains("Rahul"));

        // size()
        System.out.println("Size : " + students.size());

        // isEmpty()
        System.out.println("Is Empty : " + students.isEmpty());

        // addAll()
        LinkedHashSet<String> newStudents = new LinkedHashSet<>();

        newStudents.add("Rohit");
        newStudents.add("Mohit");

        students.addAll(newStudents);

        System.out.println("After addAll() : " + students);

        // removeAll()
        students.removeAll(newStudents);

        System.out.println("After removeAll() : " + students);

        // retainAll()
        LinkedHashSet<String> commonStudents = new LinkedHashSet<>();

        commonStudents.add("Rahul");

        students.retainAll(commonStudents);

        System.out.println("After retainAll() : " + students);

        // clear()
        students.clear();

        System.out.println("After clear() : " + students);

    }
}