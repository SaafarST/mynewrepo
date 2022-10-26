package Day56.Tohir.PublicTransport;

import Day56.Tohir.Vehicle.Vehicle;

enum WorkingShift{
    MORNING, DAY, EVENING, NIGHT;
}

enum Lane{
    MANHATTAN, QUINS, BROOKLYN, BRONX,STATEN_ISLAND;
}

public abstract class PublicTransport extends Vehicle {
    protected Lane lane;
    protected WorkingShift workingShift;
    protected double price;
    public PublicTransport(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public PublicTransport(String brand, String model, int speed, Lane lane, WorkingShift workingShift, double price) {
        super(brand, model, speed);
        this.lane = lane;
        this.workingShift = workingShift;
        this.price = price;
    }

    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public int getNumberofPassangers() {
        return 0;
    }

    @Override
    public double getGasConsumption() {
        return 0;
    }
}
