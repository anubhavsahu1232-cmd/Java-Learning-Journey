import java.util.PriorityQueue;

public class Program112_PriorityQueueBasicMethods {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // offer()
        pq.offer(30);
        pq.offer(10);
        pq.offer(50);
        pq.offer(20);

        System.out.println("Original PriorityQueue : " + pq);

        // add()
        pq.add(40);
        System.out.println("After add() : " + pq);

        // peek()
        System.out.println("Top Element : " + pq.peek());

        // element()
        System.out.println("Element : " + pq.element());

        // poll()
        System.out.println("Removed by poll() : " + pq.poll());
        System.out.println("After poll() : " + pq);

        // remove()
        System.out.println("Removed by remove() : " + pq.remove());
        System.out.println("After remove() : " + pq);

        // contains()
        System.out.println("Contains 30 : " + pq.contains(30));

        // size()
        System.out.println("Size : " + pq.size());

        // isEmpty()
        System.out.println("Is Empty : " + pq.isEmpty());

        // clear()
        pq.clear();
        System.out.println("After clear() : " + pq);

    }
}