package creational.factory.domain;

import creational.factory.Animal;

public class Lion implements Animal {
    @Override
    public void eat() {
        System.out.println("Lion is eating...");
    }
}
