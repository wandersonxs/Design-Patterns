package creational.abstractFactory.domain;

import creational.abstractFactory.Car;

public class PetrolFord implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling Petrol Ford...");
    }
}
