package transport;

public class Truck extends Transport<DriverC> {
    public Truck(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMov() {
        System.out.println("Грузовик " + getBrand() + "начал движение");
    }

    @Override
    public void finishMov() {
        System.out.println("Грузовик " + getBrand() + "закончил движение");

    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у грузовика " + getBrand());

    }


    @Override
    public void bestLapTime() {
        int minBound = 80;
        int maxBound = 120;
        int bestLapTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для грузовика" + bestLapTime);

    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость для грузовика" + maxSpeed);

    }
}
