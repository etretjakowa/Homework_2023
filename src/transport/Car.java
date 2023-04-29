package transport;

import java.util.List;

public class Car extends Transport<DriverB> {

    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, DriverB driver, BodyType bodyType, List<Mechanic> mechanics) {
        super(brand, model, engineVolume, driver, mechanics);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    @Override
    public Type getType() {
        return Type.CAR;
    }


    @Override
    public void startMov() {
        if (gasTankBar <= 0) {
            throw new EmptyGasTankException(this);
        }
        if (oilTankBar <= 0) {
            throw new NoOilException(this);
        }
        System.out.println("Автомобиль " + getBrand() + " начал движение");
    }

    @Override
    public void finishMov(double oilLiters, double gasLiters) {
        gasTankBar -= gasLiters;
        oilTankBar -= oilLiters;

        System.out.println("Автомобиль " + getBrand() + "закончил движение");

    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автомобиля " + getBrand());
    }


    @Override
    public void bestLapTime() {
        int minBound = 80;
        int maxBound = 120;
        int bestLapTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для автомобиля" + bestLapTime);

    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость для автомобиля" + maxSpeed);

    }
    @Override
    public void runDiagnostic() {
        System.out.println("Диагностика пройдена  " + getBrand() + getModel());
    }

    enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбэк"),
        COUPE("Купе"),
        STATION_WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");
        private String carBodyType;

        BodyType(String carBodyType) {
            this.carBodyType = carBodyType;
        }

        public String getCarBodyType() {
            return carBodyType;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + carBodyType;
        }
    }

    @Override
    public String toString() {
        return "Тип кузова: " + bodyType.carBodyType + ", " + super.toString();
    }

}