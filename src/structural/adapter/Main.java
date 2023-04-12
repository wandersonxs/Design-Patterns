package structural.adapter;

import structural.adapter.domain.Bus;
import structural.adapter.domain.Car;
import structural.adapter.domain.Vehicle;
import structural.adapter.external.domain.Bycicle;
import structural.adapter.external.domain.BycicleAdapter;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bus = new Bus();
        Vehicle bycicle = new BycicleAdapter(new Bycicle());

        car.accelarate();
        bus.accelarate();
        bycicle.accelarate();
    }

}
