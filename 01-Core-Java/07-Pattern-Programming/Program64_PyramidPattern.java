import java.util.Scanner;

public class Program64_PyramidPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        for (int i = 1; i <= size; i++) {

            // Print Spaces
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }

            // Print Stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}