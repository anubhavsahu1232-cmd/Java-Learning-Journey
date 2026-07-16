import java.util.Hashtable;

public class Program131_HashtableBasicMethods {

    public static void main(String[] args) {

        Hashtable<Integer, String> students = new Hashtable<>();

        // put()
        students.put(101, "Anubhav");
        students.put(102, "Rahul");
        students.put(103, "Aman");

        System.out.println("Original Hashtable : " + students);

        // get()
        System.out.println("Student with Key 102 : " + students.get(102));

        // containsKey()
        System.out.println("Contains Key 101 : " + students.containsKey(101));

        // containsValue()
        System.out.println("Contains Value Aman : " + students.containsValue("Aman"));

        // replace()
        students.replace(103, "Rohit");

        System.out.println("After replace() : " + students);

        // putIfAbsent()
        students.putIfAbsent(104, "Mohit");
        students.putIfAbsent(101, "Karan");

        System.out.println("After putIfAbsent() : " + students);

        // remove()
        students.remove(102);

        System.out.println("After remove() : " + students);

        // size()
        System.out.println("Size : " + students.size());

        // isEmpty()
        System.out.println("Is Empty : " + students.isEmpty());

        // clear()
        students.clear();

        System.out.println("After clear() : " + students);

    }
}