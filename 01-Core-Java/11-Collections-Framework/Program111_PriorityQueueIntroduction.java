import java.util.PriorityQueue;

public class Program111_PriorityQueueIntroduction {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(50);
        pq.offer(20);

        System.out.println(pq);

    }
}