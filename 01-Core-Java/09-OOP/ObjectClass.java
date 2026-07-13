//Program90_ObjectClass

class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", Age = " + age;
    }
}

public class ObjectClass {

    public static void main(String[] args) {

        Student student = new Student("Anubhav", 22);

        System.out.println(student);

        System.out.println(student.getClass());

        System.out.println(student.hashCode());

        System.out.println(student.equals(student));

    }
}