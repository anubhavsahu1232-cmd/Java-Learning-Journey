public class Program91_TryCatch {
    public static void main(String[] args) {
        try {
            int n = 10 / 0;
            System.out.println(n);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");

        }
    }
}