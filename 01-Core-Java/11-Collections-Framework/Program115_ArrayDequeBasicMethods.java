import java.util.ArrayDeque;

public class Program115_ArrayDequeBasicMethods {

    public static void main(String[] args) {

        ArrayDeque<String> adq = new ArrayDeque<>();

        // offerFirst()
        adq.offerFirst("Java");

        // offerLast()
        adq.offerLast("Python");
        adq.offerLast("C++");

        System.out.println("Original Deque : " + adq);

        // peekFirst()
        System.out.println("First Element : " + adq.peekFirst());

        // peekLast()
        System.out.println("Last Element : " + adq.peekLast());

        // pollFirst()
        System.out.println("Removed First : " + adq.pollFirst());
        System.out.println("After pollFirst() : " + adq);

        // pollLast()
        System.out.println("Removed Last : " + adq.pollLast());
        System.out.println("After pollLast() : " + adq);

        // push()
        adq.push("HTML");
        System.out.println("After push() : " + adq);

        // pop()
        System.out.println("Removed by pop() : " + adq.pop());
        System.out.println("After pop() : " + adq);

        // contains()
        System.out.println("Contains Java : " + adq.contains("Java"));

        // size()
        System.out.println("Size : " + adq.size());

        // isEmpty()
        System.out.println("Is Empty : " + adq.isEmpty());

        // clear()
        adq.clear();
        System.out.println("After clear() : " + adq);
    }
}