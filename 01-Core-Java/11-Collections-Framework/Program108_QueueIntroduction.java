import java.util.LinkedList;
import java.util.Queue;

public class Program108_QueueIntroduction {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        q.offer("Anubhav");
        q.offer("Amit");
        q.offer("Ankit");
        q.offer("Abhay");

        System.out.println(q);

    }

}
