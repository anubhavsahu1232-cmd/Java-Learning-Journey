import java.util.Scanner;

public class Program60_AutomorphicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        int square = number * number;
        int temp = number;

        while (temp != 0) {
            temp = temp / 10;
            square = square / 10;
        }

        if (square % 1 == 0) {
            // Just to keep structure clear
        }

        if ((number * number) % (int) Math.pow(10, String.valueOf(number).length()) == number) {
            System.out.println(number + " is an Automorphic Number.");
        } else {
            System.out.println(number + " is Not an Automorphic Number.");
        }

        sc.close();
    }
}