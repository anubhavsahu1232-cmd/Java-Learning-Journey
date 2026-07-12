public class Program74_MethodOverloading {

    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public static double add(double n1, double n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {

        System.out.println("Sum = " + add(10, 20));
        System.out.println("Sum = " + add(10, 20, 30));
        System.out.println("Sum = " + add(10.5, 20.5));

    }
}