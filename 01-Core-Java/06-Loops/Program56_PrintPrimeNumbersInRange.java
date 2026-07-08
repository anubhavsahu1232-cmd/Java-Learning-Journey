import java.util.Scanner;

public class Program56_PrintPrimeNumbersInRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Starting Number: ");
        int start = sc.nextInt();

        System.out.print("Enter Ending Number: ");
        int end = sc.nextInt();

        System.out.println("Prime Numbers:");

        for (int number = start; number <= end; number++) {

            if (number <= 1) {
                continue;
            }

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {

                if (number % i == 0) {
                    isPrime = false;
                    break;
                }

            }

            if (isPrime) {
                System.out.print(number + " ");
            }

        }

        sc.close();
    }
}