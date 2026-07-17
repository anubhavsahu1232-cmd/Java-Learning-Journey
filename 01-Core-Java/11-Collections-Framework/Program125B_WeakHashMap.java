import java.util.*;

public class Program125B_WeakHashMap {

    public static void main(String[] args)
            throws Exception {

        WeakHashMap<String,String> map =
                new WeakHashMap<>();

        String key = new String("Java");

        map.put(key, "Programming");

        System.out.println(map);

        key = null;

        System.gc();

        Thread.sleep(1000);

        System.out.println(map);

    }

}