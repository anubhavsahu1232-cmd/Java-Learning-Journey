public class Program94_ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Program Started");

        try {

            int age = 16;

            if (age < 18) {
                throw new ArithmeticException("You are not eligible to vote.");
            }

            System.out.println("You can vote.");

        } catch (ArithmeticException e) {

            System.out.println("Exception : " + e.getMessage());

        }

        System.out.println("Program Ended");

    }
}