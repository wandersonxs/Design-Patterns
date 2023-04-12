package structural.adapter.external.domain;

import structural.adapter.domain.Vehicle;

public class BycicleAdapter implements Vehicle {

    private Bycicle bycicle;

    public BycicleAdapter(Bycicle bycicle) {
        this.bycicle = bycicle;
    }

    @Override
    public void accelarate() {
        bycicle.go();
    }
}
