package OOP.Driver;

import OOP.transport.Bus;

public class DriverCategoryD extends Driver<Bus>{

    public DriverCategoryD(String name, String driverLicense, int experience, Bus vehicle, DriverLicenseCategory driverLicenseCategory) throws NoInformationProvided {
        super(name, driverLicense, experience, vehicle, driverLicenseCategory);
    }


}
