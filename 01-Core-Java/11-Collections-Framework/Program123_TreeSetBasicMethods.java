import java.util.TreeSet;

public class Program123_TreeSetBasicMethods {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        // add()
        numbers.add(30);
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Original TreeSet : " + numbers);

        // remove()
        numbers.remove(20);
        System.out.println("After remove() : " + numbers);

        // contains()
        System.out.println("Contains 30 : " + numbers.contains(30));

        // first()
        System.out.println("First Element : " + numbers.first());

        // last()
        System.out.println("Last Element : " + numbers.last());

        // higher()
        System.out.println("Higher than 30 : " + numbers.higher(30));

        // lower()
        System.out.println("Lower than 30 : " + numbers.lower(30));

        // ceiling()
        System.out.println("Ceiling of 35 : " + numbers.ceiling(35));

        // floor()
        System.out.println("Floor of 35 : " + numbers.floor(35));

        // pollFirst()
        System.out.println("Removed First : " + numbers.pollFirst());

        // pollLast()
        System.out.println("Removed Last : " + numbers.pollLast());

        System.out.println("After pollFirst() & pollLast() : " + numbers);

        // size()
        System.out.println("Size : " + numbers.size());

        // isEmpty()
        System.out.println("Is Empty : " + numbers.isEmpty());

        // clear()
        numbers.clear();

        System.out.println("After clear() : " + numbers);

    }
}