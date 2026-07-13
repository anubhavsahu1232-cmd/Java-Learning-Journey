//Program89_SuperKeyword

class Animal {

    String name = "Animal";

    Animal() {
        System.out.println("Animal Constructor Called");
    }

    void display() {
        System.out.println("Parent Class Method");
    }
}

class Dog extends Animal {

    String name = "Dog";

    Dog() {

        super();

        System.out.println("Dog Constructor Called");
    }

    void show() {

        System.out.println("Child Name : " + name);
        System.out.println("Parent Name : " + super.name);

        super.display();
    }
}

public class SuperKeyword {

    public static void main(String[] args) {

        Dog dog = new Dog();

        System.out.println();

        dog.show();
    }
}