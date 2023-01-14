package Driver;

import transport.Transport;
import transport.Truck;

public class DriverCategoryC extends Driver<Truck>{

    DriverLicenseCategory driverLicenseCategory;
    public enum DriverLicenseCategory {
        DRIVER_LICENSE_CATEGORY("C");
        private String driverCategory;

        DriverLicenseCategory(String driverCategory) {
            this.driverCategory = driverCategory;
        }

        public String getDriverCategory() {
            return driverCategory;
        }

        public void setDriverCategory(String driverCategory) throws NoInformationProvided {
            if (driverCategory != null && !driverCategory.isEmpty() && driverCategory.isBlank()) {
                this.driverCategory = driverCategory;
            } else {
                throw new NoInformationProvided("Необходимо указать тип прав!");
            }
        }
    }

    public DriverCategoryC(String name, String driverLicense, int experience, Truck vehicle, DriverLicenseCategory driverLicenseCategory) {
        super(name, driverLicense, experience, vehicle);
        this.driverLicenseCategory = driverLicenseCategory;
    }

}
