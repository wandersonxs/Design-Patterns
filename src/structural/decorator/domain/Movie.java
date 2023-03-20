package structural.decorator.domain;

import structural.decorator.RideDecorator;

public class Movie extends RideDecorator {

    public Movie(Ride ride) {
        super(ride);
    }

    @Override
    public double getCost() {
        return ride.getCost() + 3.00D;
    }

    @Override
    public String getDescription() {
        return ride.getDescription() + "Movie; ";
    }

}
