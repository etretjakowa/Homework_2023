public class Car {
    static String defaultCountry = "default";
    static String defaultColor = "белый";
    static double defaultEngineVolume = 1.5;
    static int defaultYear = 2000;
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = (isEngineVolumeNull(engineVolume) ? defaultEngineVolume : engineVolume);
        this.color = (isColorEmpty(color) ? defaultColor : color);
        this.year = (isYearNull(year) ? defaultYear : year);
        this.country = (isCountryEmpty(country) ? defaultCountry : country);
    }

    public Car(String brand, String model, double engineVolume, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = defaultCountry;
    }

    public Car(String brand, String model, double engineVolume, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.year = year;
        this.country = country;
        this.color = defaultColor;
    }

    private boolean isCountryEmpty(String country) {
        return country == null || country.isEmpty();
    }

    private boolean isColorEmpty(String color) {
        return color == null || color.isEmpty();
    }

    private boolean isEngineVolumeNull(double engineVolume) {
        return engineVolume <= 0;
    }

    private boolean isYearNull(int year) {
        return year >= 0;
    }


    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country;
    }
}
