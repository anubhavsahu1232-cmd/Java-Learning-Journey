import java.util.ArrayList;

public class Program97_ArrayListCRUD{
    public static void main(String[]args){

        ArrayList<Integer> marks = new ArrayList<>();

        // Add Elements through add() method
marks.add(90);
marks.add(98);
marks.add(67);
marks.add(65);
marks.add(56);
marks.add(67);
marks.add(98);


System.out.println(marks);

//get elements through get() method
System.out.println("Third Element: " + marks.get(2));

//replace elements through set() method
marks.set( 2,40);

//remove elements through remove() method
marks.remove(3);
System.out.println("After Removing: " + marks);

//checking the size of ArrayList through size() method
System.out.println(marks.size());

//checking whether an element is present or not through contains() method
System.out.println(marks.contains(67));

//checking whether an ArrayList is empty or not through isEmpty() method
System.out.println(marks.isEmpty());

//Checking the index of an element through indexOf() method
System.out.println(marks.indexOf(67));

//Chekking the last index of an element through lastIndexOf() method
System.out.println(marks.lastIndexOf(98));

//Clearing the ArrayList through clear() method
marks.clear();
System.out.println(marks);

    }
}
