import java.util.Scanner;

public class Program32_PositiveNegativeZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println(number + " is Positive.");
        } else if (number < 0) {
            System.out.println(number + " is Negative.");
        } else {
            System.out.println("Number is Zero.");
        }

        sc.close();
    }
}