package transport;

public class DriverD extends Driver {
    public DriverD(String name, boolean hasDriverLicense, int drivingExperience) {
        super(name, hasDriverLicense, drivingExperience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитль категории D " + getName() + "начал движение");
    }

    @Override
    public void finishMov() {
        System.out.println("Водитль категории D " + getName() + "закончил движение");
    }

    @Override
    public void refuelTransport() {
        System.out.println("Водитль категории D " + getName() + "заправил автомобиль");
    }

}
