package structural.decorator.domain;

public class PlainRide implements Ride {


    @Override
    public double getCost() {
        return 10.00D;
    }

    @Override
    public String getDescription() {
        return " Ride; ";
    }

}
