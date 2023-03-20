package creational.factory;

import creational.factory.domain.Cat;
import creational.factory.domain.Dog;
import creational.factory.domain.Lion;
import creational.factory.domain.Tiger;

public class AnimalFactory {

    public static Animal getAnimal(AnimalType animalType){

        if(animalType.equals(AnimalType.CAT)){
            return new Cat();
        }

        if(animalType.equals(AnimalType.DOG)){
            return new Dog();
        }

        if(animalType.equals(AnimalType.LION)){
            return new Lion();
        }

        if(animalType.equals(AnimalType.TIGER)){
            return new Tiger();
        }

        return null;
    }

}
