package creational.abstractFactory;

import creational.abstractFactory.domain.ElectricFord;
import creational.abstractFactory.domain.ElectricToyota;

public class ElectricCarFactory implements AbstractFactory {

    @Override
    public Car getCar(String type) {
        if ("FORD".equals(type)) {
            return new ElectricFord();
        }
        if ("TOYOTA".equals(type)) {
            return new ElectricToyota();
        }
        return null;
    }
}
