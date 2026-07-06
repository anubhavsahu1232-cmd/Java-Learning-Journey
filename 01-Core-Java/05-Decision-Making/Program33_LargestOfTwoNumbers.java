import java.util.Scanner;

public class Program33_LargestOfTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int secondNumber = sc.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is the Largest Number.");
        } else if (secondNumber > firstNumber) {
            System.out.println(secondNumber + " is the Largest Number.");
        } else {
            System.out.println("Both Numbers are Equal.");
        }

        sc.close();
    }
}