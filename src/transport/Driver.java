package transport;

public abstract class Driver {
    private String name;
    private boolean hasDriverLicense;

    private int drivingExperience;

    public Driver(String name, boolean hasDriverLicense, int drivingExperience) {
        this.name = name;
        this.hasDriverLicense = hasDriverLicense;
        this.drivingExperience = drivingExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public abstract void startMove();

    public abstract void finishMov();

    public abstract void refuelTransport();

    @Override
    public String toString() {
        return " водитель №"+name + ", водительский стаж " + drivingExperience;
    }
}
