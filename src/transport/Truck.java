package transport;

public class Truck extends Transport<DriverC> {
    private LoadCapacity truck;

    public Truck(String brand, String model, double engineVolume, DriverC driver, LoadCapacity truck) {
        super(brand, model, engineVolume, driver);
        this.truck = truck;
    }

    public LoadCapacity getTruck() {
        return truck;
    }

    public enum LoadCapacity {
        N1(0, 3.5),
        N2(3.5, 12),
        N3(12, 20);
        private double min;
        private double max;

        LoadCapacity(double min, double max) {
            this.min = min;
            this.max = max;

        }

        public double getMin() {
            return min;
        }

        public double getMax() {
            return max;
        }

        public static LoadCapacity getValue(double value) {
            for (LoadCapacity e : LoadCapacity.values()) {
                if (value >= e.getMin() && value <= e.getMax()) {
                    System.out.println(e);
                    return e;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return super.toString() +
                    " от " + min +
                    " до " + max + " тонн";
        }
    }

    @Override
    public String toString() {
        return super.toString() + ". Грузоподъемность: " + truck;
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
    public Type getType() {
        return Type.TRUCK;
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
