package transport;


import java.util.ArrayList;
import java.util.List;

public abstract class Transport<T extends Driver> implements Сompeting, Diagnosticable {
    static String defaultBrand = "default";
    static String defaultModel = "default";
    private static double defaultEngineVolume = 1.5;

    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    protected int gasTankBar;
    protected int oilTankBar;

    private List<Mechanic> mechanics;


    public Transport(String brand, String model, double engineVolume, T driver, List<Mechanic> mechanics) {
        this.brand = (isBrandEmpty(brand) ? defaultBrand : brand);
        this.model = (isModelEmpty(model) ? defaultModel : model);
        this.engineVolume = (isEngineVolumeNull(engineVolume) ? defaultEngineVolume : engineVolume);
        this.driver = driver;
        this.mechanics = mechanics;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
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

    public void printMechanics(){
        System.out.println(mechanics);
    }

    public abstract void startMov();

    public abstract Type getType();

    public abstract void finishMov(double oilLiters, double gasLiters);

    @Override
    public String toString() {
        return "Марка " + brand +
                ", Модель " + model +
                ", Объем двигателя " + engineVolume + "," + driver + mechanics;

    }

    public void refuel(double liters) {
        gasTankBar += liters;
    }

    public void addOil(double liters) {
        gasTankBar += liters;
    }


}
