import java.util.Scanner;

public class Program37_VotingEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are Eligible to Vote.");
        } else {
            System.out.println("You are Not Eligible to Vote.");
        }

        sc.close();
    }
}