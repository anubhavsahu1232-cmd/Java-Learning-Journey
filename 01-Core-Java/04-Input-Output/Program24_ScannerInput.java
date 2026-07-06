import java.util.Scanner;

public class Program24_ScannerInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Welcome, " + name + "!");

        sc.close();
    }
}