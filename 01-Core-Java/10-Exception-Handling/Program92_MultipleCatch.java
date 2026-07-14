public class Program92_MultipleCatch {
    public static void main(String[] args) {
        try {
            int n[] = { 10, 20, 30 };
            System.out.println(n[5]);
            int a = 10 / 0;
            System.out.println(a);
        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of Bounds");
        }

    }

}
