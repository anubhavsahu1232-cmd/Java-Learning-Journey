import java.util.concurrent.ConcurrentHashMap;

public class Program125A_ConcurrentHashMap{

    public static void main(String[] args){

        ConcurrentHashMap<Integer,String> map =
                new ConcurrentHashMap<>();

        map.put(101,"Anubhav");

        map.put(102,"Rahul");

        map.putIfAbsent(103,"Amit");

        map.replace(102,"Rohit");

        System.out.println(map);

        System.out.println(map.get(101));

    }

}