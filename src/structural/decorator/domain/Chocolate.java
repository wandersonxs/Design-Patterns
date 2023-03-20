package structural.decorator.domain;

import structural.decorator.RideDecorator;

public class Chocolate extends RideDecorator {

    public Chocolate(Ride ride) {
        super(ride);
    }

    @Override
    public double getCost() {
        return ride.getCost() + 4.00D;
    }

    @Override
    public String getDescription() {
        return ride.getDescription() + "Chocolate; ";
    }

}
