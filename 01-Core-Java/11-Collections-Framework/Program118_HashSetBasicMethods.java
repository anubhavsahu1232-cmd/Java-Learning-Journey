import java.util.HashSet;

public class Program118_HashSetBasicMethods {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // add()
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println(set);

        // remove()
        set.remove(20);
        System.out.println(set);

        // contains()
        System.out.println(set.contains(40));

        // size()
        System.out.println(set.size());

        // isEmpty()
        System.out.println(set.isEmpty());

        // clear()
        set.clear();
        System.out.println(set);

    }

}
