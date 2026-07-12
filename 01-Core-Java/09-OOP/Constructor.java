//Program77_Constructor

public class Constructor {

    String name;
    int age;

    // Constructor
    Constructor() {

        name = "Anubhav";
        age = 22;

        System.out.println("Constructor Called");
    }

    void display() {

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

    }

    public static void main(String[] args) {

        Constructor student = new Constructor();

        student.display();

    }
}