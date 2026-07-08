import java.util.Scanner;

public class Program69_PascalTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {

            int number = 1;

            // Print Spaces
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }

            // Print Numbers
            for (int j = 0; j <= i; j++) {

                System.out.print(number + " ");

                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }

        sc.close();
    }
}