//Program76_ClassAndObject


public class ClassAndObject {
    String name;
    int age;

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {

        ClassAndObject student = new ClassAndObject();

        student.name = "Anubhav";
        student.age = 22;

        student.display();

    }
}