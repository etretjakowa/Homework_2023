package transport;

public abstract class Transport<T extends Driver> implements Сompeting {
    static String defaultBrand = "default";
    static String defaultModel = "default";
    private static double defaultEngineVolume = 1.5;

    //    static int defaultYear = 2000;
//    static String defaultCountry = "default";
//    static String defaultColor = "белый";
//    static int defaultMaxSpeed = 150;
//    private final String country;
//    private final int year;
//    private final String color;
//    private int maxSpeed;
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

    //    public Transport(String brand, String model, String country, String color, int year, int maxSpeed) {
//        this.maxSpeed = maxSpeed;
//        this.brand = (isBrandEmpty(brand) ? defaultBrand : brand);
//        this.model = (isModelEmpty(model) ? defaultModel : model);
//        this.year = (isYearNull(year) ? defaultYear : year);
//        this.country = (isCountryEmpty(country) ? defaultCountry : country);
//        this.color = (isColorEmpty(color) ? defaultColor : color);
//    }
    private boolean isEngineVolumeNull(double engineVolume) {
        return engineVolume <= 0;
    }

    private boolean isBrandEmpty(String brand) {
        return brand == null || brand.isEmpty();
    }

    private boolean isModelEmpty(String model) {
        return model == null || model.isEmpty();
    }

    //    private boolean isYearNull(int year) {
//        return year >= 0;
//    }
//
//    private boolean isCountryEmpty(String country) {
//        return country == null || country.isEmpty();
//    }
//
//    private boolean isColorEmpty(String color) {
//        return color == null || color.isEmpty();
//    }
//
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
    //    public int getYear() {
//        return year;
//    }
//
//
//    public String getCountry() {
//        return country;
//    }
//
//
//    public String getColor() {
//        return color;
//    }
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }
//    public void setMaxSpeed(int maxSpeed) {
//        this.maxSpeed = maxSpeed;
//    }
public void printInfo(){
    System.out.println("водитель"+driver.getName()+ "управляет автомобилем"+ getBrand()+" будет участвовать в заезде");
}
    public abstract void startMov();
    public abstract void finishMov();
    @Override
    public String toString() {
        return "Марка " + brand +
                ", Модель " + model +
                ", Объем двигателя" + engineVolume + driver;

    }
}
