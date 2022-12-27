package Driver;

import transport.Transport;
import transport.Truck;

public class DriverCategoryC extends Driver<Truck>{
    public DriverCategoryC(String name, String driverLicense, int experience, Truck vehicle) {
        super(name, driverLicense, experience, vehicle);
    }

}
