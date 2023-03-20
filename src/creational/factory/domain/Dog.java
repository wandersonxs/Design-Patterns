package creational.factory.domain;

import creational.factory.Animal;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }
}
