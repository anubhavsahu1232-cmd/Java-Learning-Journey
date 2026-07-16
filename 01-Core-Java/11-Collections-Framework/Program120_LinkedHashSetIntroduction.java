import java.util.LinkedHashSet;

public class Program120_LinkedHashSetIntroduction {

    public static void main(String[] args) {

        LinkedHashSet<String> students = new LinkedHashSet<>();

        students.add("Anubhav");
        students.add("Rahul");
        students.add("Aman");
        students.add("Rahul"); // Duplicate

        System.out.println(students);

    }
}