import java.util.Scanner;

public class Program26_SubtractTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int secondNumber = sc.nextInt();

        int difference = firstNumber - secondNumber;

        System.out.println("Difference = " + difference);

        sc.close();
    }
}