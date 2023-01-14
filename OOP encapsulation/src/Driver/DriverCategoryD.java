package Driver;

import transport.Bus;

public class DriverCategoryD extends Driver<Bus>{

    DriverLicenseCategory driverLicenseCategory;
    public enum DriverLicenseCategory {
        DRIVER_LICENSE_CATEGORY("D");
        private String driverCategory;

        DriverLicenseCategory(String driverCategory) {
            this.driverCategory = driverCategory;
        }

        public String getDriverCategory() {
            return driverCategory;
        }
    }
    public DriverCategoryD(String name, String driverLicense, int experience, Bus vehicle) {
        super(name, driverLicense, experience, vehicle);
    }


}
