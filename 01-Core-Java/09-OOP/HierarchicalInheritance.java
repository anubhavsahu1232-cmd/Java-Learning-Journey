//Program83C_HierarchicalInheritance

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

class Cat extends Animal {

    void meow() {
        System.out.println("Cat is Meowing");
    }

}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        dog.bark();

        System.out.println();

        cat.eat();
        cat.meow();

    }
}