package transport;

public class DriverB extends Driver {
    public DriverB(String name, boolean hasDriverLicense, int drivingExperience) {
        super(name, hasDriverLicense, drivingExperience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитль категории B " + getName() + "начал движение");
    }

    @Override
    public void finishMov() {
        System.out.println("Водитль категории B " + getName() + "закончил движение");
    }

    @Override
    public void refuelTransport() {
        System.out.println("Водитль категории B " + getName() + "заправил автомобиль");
    }
}
