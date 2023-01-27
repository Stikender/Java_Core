package OOP.Driver;

import OOP.transport.Car;

public class DriverCategoryB extends Driver<Car>{

    public DriverCategoryB(String name, String driverLicense, int experience, Car vehicle, DriverLicenseCategory driverLicenseCategory) throws NoInformationProvided {
        super(name, driverLicense, experience, vehicle, driverLicenseCategory);
    }

}
