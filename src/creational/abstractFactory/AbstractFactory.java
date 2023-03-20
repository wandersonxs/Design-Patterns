package creational.abstractFactory;

import creational.factory.Animal;
import creational.factory.AnimalType;
import creational.factory.domain.Cat;
import creational.factory.domain.Dog;
import creational.factory.domain.Lion;
import creational.factory.domain.Tiger;

public interface AbstractFactory {
    Car getCar(String type);
}
