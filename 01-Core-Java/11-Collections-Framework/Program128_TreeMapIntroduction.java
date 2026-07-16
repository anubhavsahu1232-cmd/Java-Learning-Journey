import java.util.TreeMap;

public class Program128_TreeMapIntroduction {

    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(103, "Aman");
        students.put(101, "Anubhav");
        students.put(102, "Rahul");

        System.out.println(students);

    }
}