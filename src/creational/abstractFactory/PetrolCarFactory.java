package creational.abstractFactory;

import creational.abstractFactory.domain.ElectricFord;
import creational.abstractFactory.domain.ElectricToyota;
import creational.abstractFactory.domain.PetrolFord;
import creational.abstractFactory.domain.PetrolToyota;

public class PetrolCarFactory implements AbstractFactory {

    @Override
    public Car getCar(String type) {
        if ("FORD".equals(type)) {
            return new PetrolFord();
        }
        if ("TOYOTA".equals(type)) {
            return new PetrolToyota();
        }
        return null;
    }
}
