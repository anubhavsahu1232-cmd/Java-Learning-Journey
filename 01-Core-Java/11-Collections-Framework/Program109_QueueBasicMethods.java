import java.util.LinkedList;
import java.util.Queue;

public class Program109_QueueBasicMethods {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        // offer()
        q.offer("Anubhav");
        q.offer("Amit");
        q.offer("Ankit");
        q.offer("Abhay");

        System.out.println(q);

        // peek()
        System.out.println("Front Element: " + q.peek());

        // poll()
        q.poll();
        System.out.println("After Removing Front Element: " + q);

        // size()
        q.size();
        System.out.println("Size of Queue: " + q.size());

        // isEmpty()
        System.out.println("Is Queue Empty? " + q.isEmpty());

        // clear()
        q.clear();
        System.out.println("After Clearing Queue: " + q);

    }

}