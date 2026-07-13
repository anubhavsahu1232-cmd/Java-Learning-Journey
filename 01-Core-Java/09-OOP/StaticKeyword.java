//Program81-StaticKeyword

public class StaticKeyword {

    String name;
    static String college = "KIT College";

    StaticKeyword(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name    : " + name);
        System.out.println("College : " + college);
    }

    public static void main(String[] args) {

        StaticKeyword student1 =
                new StaticKeyword("Anubhav");

        StaticKeyword student2 =
                new StaticKeyword("Rahul");

        student1.display();
        System.out.println();

        student2.display();

    }
}