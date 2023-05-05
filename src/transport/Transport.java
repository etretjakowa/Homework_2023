package transport;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    private List<Mechanic> mechanics = new ArrayList<>();


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && gasTankBar == transport.gasTankBar && oilTankBar == transport.oilTankBar && brand.equals(transport.brand) && model.equals(transport.model) && driver.equals(transport.driver) && mechanics.equals(transport.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver, gasTankBar, oilTankBar, mechanics);
    }
}
