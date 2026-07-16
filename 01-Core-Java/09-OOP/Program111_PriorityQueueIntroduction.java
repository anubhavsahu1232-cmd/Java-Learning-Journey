import java.util.PriorityQueue;

public class Program111_PriorityQueueIntroduction {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // offer()
        pq.offer(40);
        pq.offer(20);
        pq.offer(10);
        pq.offer(30);

        System.out.println(pq);

    }

}
