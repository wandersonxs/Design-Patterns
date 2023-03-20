package structural.decorator;

import structural.decorator.domain.Ride;

public abstract class RideDecorator implements Ride {

    protected Ride ride;

    public RideDecorator(Ride ride) {
        this.ride = ride;
    }

    @Override
    public double getCost() {
        return this.ride.getCost();
    }

    @Override
    public String getDescription() {
        return this.ride.getDescription();
    }
}
