import java.util.Scanner;

public class Program28_AreaOfCircle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius : ");
        double radius = sc.nextDouble();

        double area = 3.14159 * radius * radius;

        System.out.println("Area of Circle = " + area);

        sc.close();
    }
}