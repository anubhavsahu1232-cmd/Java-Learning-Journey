import java.util.Stack;

public class Program106_StackBasicMethods {
    public static void main(String[] args) {

        Stack<String> courses = new Stack<>();

        // adding elements through push() method
        courses.push("JAVA");
        courses.push("C");
        courses.push("PYTHON");
        System.out.println(courses);

        // reading the top element through peek() method
        System.out.println("Top Element is: " + courses.peek());

        // removing the top element through pop() method
        courses.pop();
        System.out.println(courses);

        // checking whether the stack is empty or not through isEmpty() method
        System.out.println("Is the stack empty? " + courses.isEmpty());

        // checking the size of the stack through size() method
        System.out.println("Size of the stack is: " + courses.size());

        // searching an element through search() method
        System.out.println("Position of JAVA is: " + courses.search("JAVA"));

        // removing all the elements through clear() method
        courses.clear();
        System.out.println(courses);
    }

}
