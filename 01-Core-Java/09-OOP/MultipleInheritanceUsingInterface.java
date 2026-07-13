//Program83D_MultipleInheritanceUsingInterface

interface Animal {

    void eat();

}

interface Pet {

    void play();

}

class Dog implements Animal, Pet {

    public void eat() {
        System.out.println("Dog is Eating");
    }

    public void play() {
        System.out.println("Dog is Playing");
    }

}

public class MultipleInheritanceUsingInterface {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();
        dog.play();

    }
}