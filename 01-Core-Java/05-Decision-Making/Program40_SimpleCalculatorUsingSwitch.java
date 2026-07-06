import java.util.Scanner;

public class Program40_SimpleCalculatorUsingSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        double firstNumber = sc.nextDouble();

        System.out.print("Enter Operator (+, -, *, /) : ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter Second Number : ");
        double secondNumber = sc.nextDouble();

        switch (operator) {

            case '+':
                System.out.println("Result = " + (firstNumber + secondNumber));
                break;

            case '-':
                System.out.println("Result = " + (firstNumber - secondNumber));
                break;

            case '*':
                System.out.println("Result = " + (firstNumber * secondNumber));
                break;

            case '/':
                if (secondNumber != 0) {
                    System.out.println("Result = " + (firstNumber / secondNumber));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator!");
        }

        sc.close();
    }
}