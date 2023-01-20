package Driver;

import transport.Transport;

import java.util.Objects;

import static Driver.Driver.DriverLicenseCategory.*;

public class Driver <T extends Transport>{
    private String name;
    private String driverLicense;
    private int experience;
    private T vehicle;
    DriverLicenseCategory driverLicenseCategory;
    public enum DriverLicenseCategory {
        DRIVER_LICENSE_CATEGORY_C("C"),
        DRIVER_LICENSE_CATEGORY_B("B"),
        DRIVER_LICENSE_CATEGORY_D("D");
        private String driverCategory;

        DriverLicenseCategory(String driverCategory) {
            this.driverCategory = driverCategory;
        }

        public String getDriverCategory() throws NoInformationProvided{

            return driverCategory;
        }

        public void setDriverCategory(String driverCategory) {
                this.driverCategory = driverCategory;
        }
        @Override
        public String toString() {
                return driverCategory;
        }
    }
    public Driver(String name, String driverLicense, int experience, T vehicle, DriverLicenseCategory driverLicenseCategory) throws NoInformationProvided {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "default";
        } else {
            this.name = name;
        }
        if (driverLicense == null || driverLicense.isEmpty() || driverLicense.isBlank()) {
            this.driverLicense = "default";
        } else {
            this.driverLicense = driverLicense;
        }
        if (Double.compare(experience, 0) == 0) {
            this.experience = 5;
        } else {
            this.experience = experience;
        }
        this.vehicle = vehicle;
        if (driverLicenseCategory != null) {
            this.driverLicenseCategory = driverLicenseCategory;
        } else {
            throw new NoInformationProvided("Необходимо указать тип прав!");
        }
    }

        public Driver(String name) {
        this.name = name;
    }

    public void startMoving() {
        System.out.println("Сажусь на водительское место");
        System.out.println("Завожу автомобиль");
        System.out.println("Еду");
    }

    public void stopMoving() {
        System.out.println("Паркую автомобиль");
        System.out.println("Глушу мотор!");
    }

    public void fillTheCar() {
        System.out.println("Заехать на Пит-Стоп");
        System.out.println("Заправить автомобиль");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }

    public DriverLicenseCategory getDriverLicenseCategory() {
        return driverLicenseCategory;
    }
    public void setDriverLicenseCategory(DriverLicenseCategory driverLicenseCategory) throws NoInformationProvided{
        if (driverLicenseCategory != null) {
            this.driverLicenseCategory = driverLicenseCategory;
        } else {
            throw new NoInformationProvided("Необходимо указать тип прав!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver<?> driver = (Driver<?>) o;
        return getExperience() == driver.getExperience() && Objects.equals(getName(), driver.getName()) && Objects.equals(getDriverLicense(), driver.getDriverLicense()) && Objects.equals(getVehicle(), driver.getVehicle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDriverLicense(), getExperience(), getVehicle());
    }

    @Override
    public String toString() {
        return "Водитель " + getName() + ", категория прав: " + getDriverLicenseCategory() + " управляет автомобилем " + getVehicle();
    }
}
