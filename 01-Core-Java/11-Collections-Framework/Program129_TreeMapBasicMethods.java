import java.util.TreeMap;

public class Program129_TreeMapBasicMethods {

    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        // put()
        students.put(103, "Aman");
        students.put(101, "Anubhav");
        students.put(105, "Rohit");
        students.put(102, "Rahul");
        students.put(104, "Mohit");

        System.out.println("Original TreeMap : " + students);

        // get()
        System.out.println("Student with Key 102 : " + students.get(102));

        // containsKey()
        System.out.println("Contains Key 101 : " + students.containsKey(101));

        // containsValue()
        System.out.println("Contains Value Aman : " + students.containsValue("Aman"));

        // firstKey()
        System.out.println("First Key : " + students.firstKey());

        // lastKey()
        System.out.println("Last Key : " + students.lastKey());

        // higherKey()
        System.out.println("Higher Key than 102 : " + students.higherKey(102));

        // lowerKey()
        System.out.println("Lower Key than 102 : " + students.lowerKey(102));

        // ceilingKey()
        System.out.println("Ceiling Key of 102 : " + students.ceilingKey(102));

        // floorKey()
        System.out.println("Floor Key of 102 : " + students.floorKey(102));

        // replace()
        students.replace(103, "Karan");
        System.out.println("After replace() : " + students);

        // putIfAbsent()
        students.putIfAbsent(106, "Deepak");
        students.putIfAbsent(101, "Vikas");

        System.out.println("After putIfAbsent() : " + students);

        // remove()
        students.remove(105);

        System.out.println("After remove() : " + students);

        // size()
        System.out.println("Size : " + students.size());

        // isEmpty()
        System.out.println("Is Empty : " + students.isEmpty());

        // clear()
        students.clear();

        System.out.println("After clear() : " + students);
    }
}