import java.util.Scanner;

public class Program38_VowelOrConsonant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Character : ");
        char ch = sc.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel.");
        } else if ((ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is a Consonant.");
        } else {
            System.out.println("Invalid Input.");
        }

        sc.close();
    }
}