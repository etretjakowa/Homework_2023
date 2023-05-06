package transport;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return hasDriverLicense == driver.hasDriverLicense && drivingExperience == driver.drivingExperience && name.equals(driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hasDriverLicense, drivingExperience);
    }


}
