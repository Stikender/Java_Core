package Driver;

import transport.Car;

public class DriverCategoryB extends Driver<Car>{
    DriverLicenseCategory driverLicenseCategory;
    public enum DriverLicenseCategory {
        DRIVER_LICENSE_CATEGORY("B");
        private String driverCategory;

        DriverLicenseCategory(String driverCategory) {
            this.driverCategory = driverCategory;
        }

        public String getDriverCategory() {
            return driverCategory;
        }
    }
    public DriverCategoryB(String name, String driverLicense, int experience, Car vehicle) {
        super(name, driverLicense, experience, vehicle);
    }

}
