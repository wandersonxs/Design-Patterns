package structural.decorator.domain;

import structural.decorator.RideDecorator;

public class Music extends RideDecorator {

    public Music(Ride ride) {
        super(ride);
    }

    @Override
    public double getCost() {
        return ride.getCost() + 1.00D;
    }

    @Override
    public String getDescription() {
        return ride.getDescription() + "Music; ";
    }

}
