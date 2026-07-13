//Program88_FinalKeyword

final class Animal {

    final String TYPE = "Mammal";

    final void display() {
        System.out.println("Animal Type : " + TYPE);
    }

}

public class FinalKeyword {

    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.display();

    }
}