package structural.adapter.domain;

public class Car implements Vehicle{

    @Override
    public void accelarate() {
        System.out.println("Car accelerating...");
    }
}
