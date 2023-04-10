package transport;

public class DriverC extends Driver{
    public DriverC(String name, boolean hasDriverLicense, int drivingExperience) {
        super(name, hasDriverLicense, drivingExperience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитль категории C " + getName() + "начал движение");
    }

    @Override
    public void finishMov() {
        System.out.println("Водитль категории C " + getName() + "закончил движение");
    }

    @Override
    public void refuelTransport() {
        System.out.println("Водитль категории C " + getName() + "заправил грузовик");
    }

}
