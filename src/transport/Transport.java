package transport;

public abstract class Transport<T extends Driver> implements Сompeting {
    static String defaultBrand = "default";
    static String defaultModel = "default";
    private static double defaultEngineVolume = 1.5;

    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;

    public Transport(String brand, String model, double engineVolume, T driver) {
        this.brand = (isBrandEmpty(brand) ? defaultBrand : brand);
        this.model = (isModelEmpty(model) ? defaultModel : model);
        this.engineVolume = (isEngineVolumeNull(engineVolume) ? defaultEngineVolume : engineVolume);
        this.driver = driver;
    }


    private boolean isEngineVolumeNull(double engineVolume) {
        return engineVolume <= 0;
    }

    private boolean isBrandEmpty(String brand) {
        return brand == null || brand.isEmpty();
    }

    private boolean isModelEmpty(String model) {
        return model == null || model.isEmpty();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }


    public void printInfo() {
        System.out.println("водитель № " + driver.getName() + " управляет автомобилем " + getBrand() + " и будет участвовать в заезде");
    }

    public abstract void startMov();

    public abstract void finishMov();
public abstract Type getType();
    @Override
    public String toString() {
        return "Марка " + brand +
                ", Модель " + model +
                ", Объем двигателя " + engineVolume + "," + driver;

    }
}
