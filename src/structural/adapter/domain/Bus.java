package structural.adapter.domain;

public class Bus implements Vehicle{

    @Override
    public void accelarate() {
        System.out.println("Bus accelerating...");
    }
}
