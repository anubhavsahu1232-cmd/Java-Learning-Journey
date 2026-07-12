public class Program75_VariableArguments {

    public static int findSum(int... numbers) {

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Sum = " + findSum(10, 20));
        System.out.println("Sum = " + findSum(10, 20, 30));
        System.out.println("Sum = " + findSum(10, 20, 30, 40, 50));

    }
}