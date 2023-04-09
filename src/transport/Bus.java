package transport;

public class Bus extends Transport<DriverD> {

    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса " + getBrand());

    }

    @Override
    public void bestLapTime() {
        int minBound = 80;
        int maxBound = 120;
        int bestLapTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для автобуса" + bestLapTime);

    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость для автобуса" + maxSpeed);

    }

    @Override
    public void startMov() {
        System.out.println("Автобус " + getBrand() + "начал движение");
    }

    @Override
    public void finishMov() {
        System.out.println("Автобус " + getBrand() + "закончил движение");

    }
}
