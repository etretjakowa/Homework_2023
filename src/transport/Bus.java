package transport;

public class Bus extends Transport<DriverD> {
    private ClassificationBus classificationBus;

    public Bus(String brand, String model, double engineVolume, DriverD driver, ClassificationBus classificationBus) {
        super(brand, model, engineVolume, driver);
        this.classificationBus = classificationBus;
    }

    public ClassificationBus getClassificationBus() {
        return classificationBus;
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

    @Override
    public Type getType() {
        return Type.BUS;
    }

    public enum ClassificationBus {
        XS(10, 10),
        S(10, 25),
        M(25, 50),
        L(50, 80),
        XL(80, 120);
        private int min;
        private int max;

        ClassificationBus(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }

        public static ClassificationBus getValueBus(double value) {
            for (ClassificationBus i : ClassificationBus.values()) {
                if (value >= i.getMin() && value <= i.getMax()) {
                    System.out.println(i);
                    return i;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return super.toString() +
                    " от " + min +
                    " до " + max + " пассажиров";
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ". Вместимость: " + classificationBus;
    }
}
