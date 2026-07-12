//Program78_DefaultConstructor

public class DefaultConstructor {

    String name;
    int age;

    void display() {

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

    }

    public static void main(String[] args) {

        DefaultConstructor student = new DefaultConstructor();

        student.display();

    }
}