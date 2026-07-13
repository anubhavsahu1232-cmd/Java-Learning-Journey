//Program83A_SingleInheritance

class Animal {

    void eat() {
        System.out.println("Animal is Eating");
    }

}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is Barking");
    }

}

public class SingleInheritance {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();
        dog.bark();

    }
}