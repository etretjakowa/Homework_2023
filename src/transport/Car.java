package transport;

public class Car extends Transport {
    private static String defaultRegNumber = "default";
    private static String defaultTransmissionBox = "default";
    private static String defaultBodyType = "default";
    private static double defaultEngineVolume = 1.5;
    private static int defaultCapacity = 5;
    private int capacity;//
    private String bodyType;//
    double engineVolume;
    private String transmissionBox;//
    private String regNumber;//
    private boolean summerTires;
    private Key key;


    public Car(String brand, String model, String country, String color,int year, int maxSpeed, int capacity, String bodyType,
               double engineVolume, String transmissionBox, String regNumber, boolean summerTires, Key key) {
        super(brand, model, country,color, year, maxSpeed);
        this.capacity = (isCapacityNull(capacity) ? defaultCapacity : capacity);
        this.bodyType = (isBodyTypeEmpty(bodyType) ? defaultBodyType : bodyType);
        this.transmissionBox = (isTransmissionBoxEmpty(transmissionBox) ? defaultTransmissionBox : transmissionBox);
        this.summerTires = summerTires;
        this.engineVolume = (isEngineVolumeNull(engineVolume) ? defaultEngineVolume : engineVolume);
        this.regNumber = (isRegNumberEmpty(regNumber) ? defaultRegNumber : regNumber);
        setKey(key);
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

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return (remoteEngineStart ? " удалённый запуск двигателя, " : " без удалённый запуск двигателя, ")
                    + (keylessAccess ? "безключевой доступ" : "безключевой доступ отсутствует");
        }
    }


    @Override
    public String toString() {
        return super.toString() + ", Количество мест " + capacity +
                ", Тип кузова " + bodyType +
                ", Объем двигателя " + engineVolume +
                ", Коробка передач " + transmissionBox +
                ", Регистрационный номер " + regNumber + "," +
                (summerTires ? " летняя" : " зимняя") + " резина," + key;
    }
}