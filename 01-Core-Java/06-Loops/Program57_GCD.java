import java.util.Scanner;

public class Program57_GCD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNumber = sc.nextInt();

        while (secondNumber != 0) {

            int remainder = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = remainder;

        }

        System.out.println("GCD = " + firstNumber);

        sc.close();
    }
}