//Program87_Interface

interface Animal {

    void sound();

}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog Barks");
    }

}

public class Interface {

    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.sound();

    }
}