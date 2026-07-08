import java.util.Scanner;

public class Program58_LCM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNumber = sc.nextInt();

        int a = firstNumber;
        int b = secondNumber;

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        int gcd = a;
        int lcm = (firstNumber * secondNumber) / gcd;

        System.out.println("LCM = " + lcm);

        sc.close();
    }
}