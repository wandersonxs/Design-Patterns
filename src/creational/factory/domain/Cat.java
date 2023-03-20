package creational.factory.domain;

import creational.factory.Animal;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating...");
    }
}
