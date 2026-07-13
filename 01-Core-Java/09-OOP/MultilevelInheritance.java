//Program83B_MultilevelInheritance

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

class Puppy extends Dog {

    void weep() {
        System.out.println("Puppy is Weeping");
    }

}

public class MultilevelInheritance {

    public static void main(String[] args) {

        Puppy puppy = new Puppy();

        puppy.eat();
        puppy.bark();
        puppy.weep();

    }
}