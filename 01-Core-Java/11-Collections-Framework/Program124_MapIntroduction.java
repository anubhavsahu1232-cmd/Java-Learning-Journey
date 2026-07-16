import java.util.HashMap;
import java.util.Map;

public class Program124_MapIntroduction {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Anubhav");
        students.put(102, "Rahul");
        students.put(103, "Aman");

        System.out.println(students);

    }
}