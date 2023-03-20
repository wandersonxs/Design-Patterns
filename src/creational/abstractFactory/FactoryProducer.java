package creational.abstractFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String type) {

        if ("ELECTRIC".equalsIgnoreCase(type)) {
            return new ElectricCarFactory();
        }

        if ("PETROL".equalsIgnoreCase(type)) {
            return new PetrolCarFactory();
        }


        return null;
    }

}
