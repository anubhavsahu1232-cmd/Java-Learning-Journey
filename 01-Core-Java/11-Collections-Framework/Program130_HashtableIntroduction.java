import java.util.Hashtable;

public class Program130_HashtableIntroduction {

    public static void main(String[] args) {

        Hashtable<Integer, String> students = new Hashtable<>();

        students.put(101, "Anubhav");
        students.put(102, "Rahul");
        students.put(103, "Aman");

        System.out.println(students);

    }
}