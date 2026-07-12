//Program79_ParameterizedConstructor

public class ParameterizedConstructor {

    String name;
    int age;

    // Parameterized Constructor
    ParameterizedConstructor(String name, int age) {

        this.name = name;
        this.age = age;

    }

    void display() {

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

    }

    public static void main(String[] args) {

        ParameterizedConstructor student1 =
                new ParameterizedConstructor("Anubhav", 22);

        ParameterizedConstructor student2 =
                new ParameterizedConstructor("Rahul", 20);

        student1.display();
        System.out.println();

        student2.display();

    }
}