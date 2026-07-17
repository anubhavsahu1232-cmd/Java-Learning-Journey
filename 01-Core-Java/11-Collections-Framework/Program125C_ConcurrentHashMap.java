import java.util.*;

public class Program125C_ConcurrentHashMap{

    public static void main(String[] args){

        IdentityHashMap<String,Integer> map =
                new IdentityHashMap<>();

        String s1 =
                new String("Java");

        String s2 =
                new String("Java");

        map.put(s1,100);

        map.put(s2,200);

        System.out.println(map);

    }

}