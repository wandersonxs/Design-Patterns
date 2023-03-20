package creational.abstractFactory.domain;

import creational.abstractFactory.Car;

public class ElectricToyota implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling Electric Toyota...");
    }
}
