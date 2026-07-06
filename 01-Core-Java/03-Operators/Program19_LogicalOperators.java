public class Program19_LogicalOperators {

    public static void main(String[] args) {

        int age = 22;
        boolean hasLicense = true;

        System.out.println("AND (&&) : " + (age >= 18 && hasLicense));
        System.out.println("OR (||)  : " + (age >= 18 || hasLicense));
        System.out.println("NOT (!)  : " + (!hasLicense));

    }

}