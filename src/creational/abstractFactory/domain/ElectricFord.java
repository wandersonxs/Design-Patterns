package creational.abstractFactory.domain;

import creational.abstractFactory.Car;

public class ElectricFord implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling Electric Ford...");
    }
}
