package creational.factory;

public class Main {

    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal(AnimalType.LION);
        animal.eat();

        animal = AnimalFactory.getAnimal(AnimalType.DOG);
        animal.eat();

    }

}
