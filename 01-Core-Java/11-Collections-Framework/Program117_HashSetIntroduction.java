import java.util.HashSet;

public class Program117_HashSetIntroduction {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate value, will not be added

        System.out.println(set);
    }

}