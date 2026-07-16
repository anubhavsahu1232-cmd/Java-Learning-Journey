import java.util.LinkedHashMap;

public class Program126_LinkedHashMapIntroduction {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        students.put(101, "Anubhav");
        students.put(102, "Rahul");
        students.put(103, "Aman");

        System.out.println(students);

    }
}