public class Program73_MethodWithReturnType {

    public static int addNumbers(int n1, int n2) {

        int sum = n1 + n2;
        return sum;

    }

    public static void main(String[] args) {

        int result = addNumbers(10, 20);

        System.out.println("Sum = " + result);

    }
}