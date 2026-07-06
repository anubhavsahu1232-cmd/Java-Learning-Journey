import java.util.Scanner;

public class Program34_LargestOfThreeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int secondNumber = sc.nextInt();

        System.out.print("Enter Third Number : ");
        int thirdNumber = sc.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println(firstNumber + " is the Largest Number.");
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println(secondNumber + " is the Largest Number.");
        } else {
            System.out.println(thirdNumber + " is the Largest Number.");
        }

        sc.close();
    }
}