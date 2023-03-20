package structural.decorator;

import structural.decorator.domain.Chocolate;
import structural.decorator.domain.Movie;
import structural.decorator.domain.Music;
import structural.decorator.domain.PlainRide;
import structural.decorator.domain.Ride;

public class Main {

    public static void main(String[] args) {

        Ride ride = new Chocolate(new Music(new Movie(new Chocolate(new PlainRide()))));

        System.out.println(ride.getCost());
        System.out.println(ride.getDescription());

    }
}
