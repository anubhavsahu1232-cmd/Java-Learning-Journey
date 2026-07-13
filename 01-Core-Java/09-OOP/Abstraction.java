//Program86_Abstraction

abstract class Animal {

    // Abstract Method
    abstract void sound();

    // Normal Method
    void eat() {
        System.out.println("Animal is Eating");
    }

}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }

}

public class Abstraction {

    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.sound();
        animal.eat();

    }
}