import java.util.LinkedList;

public class Program100_LinkedListMethods {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // add elements to the LinkedList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("LinkedList: " + list);

        // addFirst() method
        list.addFirst(00);
        System.out.println("After addFirst(00): " + list);

        // addLast() method
        list.addLast(60);
        System.out.println("After addLast(60): " + list);

        // getFirst() method
        System.out.println("First element: " + list.getFirst());

        // getLast() method
        System.out.println("Last element: " + list.getLast());

        // removeFirst() method
        list.removeFirst();
        System.out.println("After RemoveFirst: " + list);

        // removeLast() method
        list.removeLast();
        System.out.println("After RemoveLast: " + list);

    }
}