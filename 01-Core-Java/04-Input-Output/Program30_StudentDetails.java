import java.util.Scanner;

public class Program30_StudentDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number : ");
        int rollNo = sc.nextInt();

        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter Course : ");
        String course = sc.nextLine();

        System.out.print("Enter Percentage : ");
        double percentage = sc.nextDouble();

        System.out.println("\n----- Student Details -----");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Course     : " + course);
        System.out.println("Percentage : " + percentage + "%");

        sc.close();
    }
}