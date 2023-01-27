package OOP.Driver;

import OOP.transport.Truck;

public class DriverCategoryC extends Driver<Truck>{

    public DriverCategoryC(String name, String driverLicense, int experience, Truck vehicle, DriverLicenseCategory driverLicenseCategory) throws NoInformationProvided{
        super(name, driverLicense, experience, vehicle,driverLicenseCategory);
    }

}
