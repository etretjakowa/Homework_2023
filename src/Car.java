public class Car {
    private static String defaultCountry = "default";
    private static String defaultModel = "default";
    private static String defaultBrand = "default";
    private static String defaultColor = "белый";

    private static String defaultRegNumber = "default";
    private static String defaultTransmissionBox = "default";
    private static String defaultBodyType = "default";
    private static double defaultEngineVolume = 1.5;
    private static int defaultYear = 2000;
    private static int defaultCapacity = 5;
    private String brand;
    private String model;
    private int year;
    private String country;
    private int capacity;//
    private String bodyType;//
    double engineVolume;
    String color;
    String transmissionBox;//
    String regNumber;//
    boolean summerTires;

    public Car(String brand, String model, int year, String country, int capacity, String bodyType,
               double engineVolume, String color, String transmissionBox, String regNumber, boolean summerTires) {
        this.brand = brand;
        this.model = model;
        this.capacity = (isCapacityNull(capacity) ? defaultCapacity : capacity);
        this.bodyType = (isBodyTypeEmpty(bodyType) ? defaultBodyType : bodyType);
        this.transmissionBox = (isTransmissionBoxEmpty(transmissionBox) ? defaultTransmissionBox : transmissionBox);
        this.summerTires = summerTires;
        this.year = (isYearNull(year) ? defaultYear : year);
        this.country = (isCountryEmpty(country) ? defaultCountry : country);
        this.engineVolume = (isEngineVolumeNull(engineVolume) ? defaultEngineVolume : engineVolume);
        this.color = (isColorEmpty(color) ? defaultColor : color);
        this.regNumber = (isRegNumberEmpty(regNumber) ? defaultRegNumber : regNumber);

    }


//    public Car(boolean summerTires) {
//        this.brand = defaultBrand;
//        this.model = defaultModel;
//        this.capacity = defaultCapacity;
//        this.bodyType = defaultBodyType;
//        this.transmissionBox = defaultTransmissionBox;
//        this.summerTires = summerTires;
//        this.year = defaultYear;
//        this.country = defaultCountry;
//        this.engineVolume = defaultEngineVolume;
//        this.color = defaultColor;
//        this.regNumber = defaultRegNumber;
//
//    }


    public Car(int year, String country, int capacity, String bodyType,
               double engineVolume, String color,
               boolean summerTires) {
        this.brand = defaultBrand;
        this.model = defaultModel;
        this.year = year;
        this.country = country;
        this.capacity = capacity;
        this.bodyType = bodyType;
        this.engineVolume = engineVolume;
        this.color = color;
        this.transmissionBox = defaultTransmissionBox;
        this.regNumber = defaultRegNumber;
        this.summerTires = summerTires;
    }

    public Car(String brand, String model, int year, int capacity, String bodyType,
               double engineVolume, String color, String transmissionBox, String regNumber, boolean summerTires) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = defaultCountry;
        this.capacity = capacity;
        this.bodyType = bodyType;
        this.engineVolume = engineVolume;
        this.color = color;
        this.transmissionBox = transmissionBox;
        this.regNumber = regNumber;
        this.summerTires = summerTires;
    }

    public Car(String brand, String model, int year, String country, int capacity, String bodyType,
               double engineVolume, String transmissionBox, String regNumber, boolean summerTires) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.capacity = capacity;
        this.bodyType = bodyType;
        this.engineVolume = engineVolume;
        this.color = defaultColor;
        this.transmissionBox = transmissionBox;
        this.regNumber = regNumber;
        this.summerTires = summerTires;
    }

    public Car(String brand, String model, int year, String country, String bodyType,
               double engineVolume, String color, String transmissionBox, String regNumber, boolean summerTires) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.capacity = defaultCapacity;
        this.bodyType = bodyType;
        this.engineVolume = engineVolume;
        this.color = color;
        this.transmissionBox = transmissionBox;
        this.regNumber = regNumber;
        this.summerTires = summerTires;
    }

    public Car(String brand, String model, int year, String country, int capacity,
               double engineVolume, String color, String transmissionBox, String regNumber, boolean summerTires) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.capacity = capacity;
        this.bodyType = defaultBodyType;
        this.engineVolume = engineVolume;
        this.color = color;
        this.transmissionBox = transmissionBox;
        this.regNumber = regNumber;
        this.summerTires = summerTires;
    }
//    public Car(String brand, String model, int year, String country, int capacity, String bodyType,
//               double engineVolume, String color, String regNumber, boolean summerTires) {
//        this.brand = brand;
//        this.model = model;
//        this.year = year;
//        this.country = country;
//        this.capacity = capacity;
//        this.bodyType = bodyType;
//        this.engineVolume = engineVolume;
//        this.color = color;
//        this.transmissionBox = defaultTransmissionBox;
//        this.regNumber = regNumber;
//        this.summerTires = summerTires;
//    }


    private boolean isCountryEmpty(String country) {
        return country == null || country.isEmpty();
    }

    private boolean isColorEmpty(String color) {
        return color == null || color.isEmpty();
    }

    private boolean isBodyTypeEmpty(String bodyType) {
        return bodyType == null || bodyType.isEmpty();
    }

    private boolean isTransmissionBoxEmpty(String transmissionBox) {
        return transmissionBox == null || transmissionBox.isEmpty();
    }

    private boolean isRegNumberEmpty(String regNumber) {
        return regNumber == null || regNumber.isEmpty();
    }

    private boolean isEngineVolumeNull(double engineVolume) {
        return engineVolume <= 0;
    }

    private boolean isCapacityNull(int capacity) {
        return capacity <= 0;
    }

    private boolean isYearNull(int year) {
        return year >= 0;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getBodyType() {
        return bodyType;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmissionBox() {
        return transmissionBox;
    }

    public void setTransmissionBox(String transmissionBox) {
        this.transmissionBox = transmissionBox;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int registrationNumber) {
        this.regNumber = regNumber;
    }

    public boolean getSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    private void changeTires(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            summerTires = false;
        }
        if (month >= 4 && month <= 10) {
            summerTires = true;
        }
    }

    private class Key {
        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        private boolean remoteEngineStart;
        private boolean keylessAccess;

    }


    @Override
    public String toString() {
        return "Марка " + brand +
                ", Модель " + model +
                ", Год производства " + year +
                ", Страна " + country +
                ", Количество мест " + capacity +
                ", Тип кузова " + bodyType +
                ", Объем двигателя " + engineVolume +
                ", Цвет " + color +
                ", Коробка передач " + transmissionBox +
                ", Регистрационный номер" + regNumber + "," +
                (summerTires ? " летняя" : " зимняя") + " резина";
    }
}