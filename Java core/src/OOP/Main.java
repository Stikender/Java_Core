package OOP;

import OOP.Driver.Driver;
import OOP.transport.*;
import OOP.transport.*;

import java.util.*;

import static OOP.Driver.Driver.DriverLicenseCategory.*;
import static OOP.transport.Bus.VehicleType.BUS;
import static OOP.transport.Car.BodyType.*;
import static OOP.transport.Car.VehicleType.PASSENGER_CAR;
import static OOP.transport.Truck.LoadLimit.*;
import static OOP.transport.Truck.VehicleType.TRUCK;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, SEDAN, PASSENGER_CAR);
        Car bMW = new Car("BMW", "Z8", 3.0, CROSSOVER, PASSENGER_CAR);
        Car kia = new Car("Kia", "Sportage", 2.4, HATCHBACK, PASSENGER_CAR);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, MINIVAN, PASSENGER_CAR);

        System.out.println(audi);
//        System.out.println(bMW);
//        System.out.println(kia);
//        System.out.println(hyundai);
//        audi.printType();
//        audi.bestLapTime();
        Driver<Car> driverCategoryB1 = new Driver<>("Петров Николай Иванович", "имеется", 10, audi, DRIVER_LICENSE_CATEGORY_B);
        Driver<Car> driverCategoryB2 = new Driver<>("Сидоров Мамай Игнатович", "имеется", 15, bMW, DRIVER_LICENSE_CATEGORY_B);
        Driver<Car> driverCategoryB3 = new Driver<>("Петров Григорий Константинович", "имеется", 5, kia, DRIVER_LICENSE_CATEGORY_B);
        Driver<Car> driverCategoryB4 = new Driver<>("Ткаченко Альберт Владимирович", "имеется", 12, hyundai, DRIVER_LICENSE_CATEGORY_B);
//        System.out.println(driverCategoryB1);
//        System.out.println(driverCategoryB2);
//        System.out.println(driverCategoryB3);
//        System.out.println(driverCategoryB4);
        Bus bus1 = new Bus("Asia", "Combi", 3.6, Bus.NumberOfSeats.ESPECIALLY_SMALL, BUS);
        Bus bus2 = new Bus("Asia", "Cosmos", 3.5, Bus.NumberOfSeats.MIDDLE, BUS);
        Bus bus3 = new Bus("ПАЗ", "4234", 3.0, Bus.NumberOfSeats.BIG, BUS);
        Bus bus4 = new Bus("Вектор", "Next", 4.4, Bus.NumberOfSeats.SMALL, BUS);

//        System.out.println(bus1);
//        System.out.println(bus2);
//        System.out.println(bus3);
//        System.out.println(bus4);
//        bus1.printType();
//       getDiagnosed(bus1);
//        getDiagnosed(audi,bus1);
        Driver<Bus> driverCategoryD1 = new Driver<>("Мусинов Иван Давыдович", "имеется", 2, bus1, DRIVER_LICENSE_CATEGORY_D);
        Driver<Bus> driverCategoryD2 = new Driver<>("Печной Леонид Петрович", "имеется", 7, bus2, DRIVER_LICENSE_CATEGORY_D);
        Driver<Bus> driverCategoryD3 = new Driver<>("Пеньков Василий Львович", "имеется", 17, bus3, DRIVER_LICENSE_CATEGORY_D);
        Driver<Bus> driverCategoryD4 = new Driver<>("Васильев Владимир Владимирович", "имеется", 7, bus4, DRIVER_LICENSE_CATEGORY_D);
//        System.out.println(driverCategoryD1);
//        System.out.println(driverCategoryD2);
//        System.out.println(driverCategoryD3);
//        System.out.println(driverCategoryD4);

        Truck truck1 = new Truck("Shacman", "SX3318", 10.8, N1, TRUCK);
        Truck truck2 = new Truck("Volvo", "FL", 7.0, N2, TRUCK);
        Truck truck3 = new Truck("Hyundai", "HD78", 3.9, N3, TRUCK);
        Truck truck4 = new Truck("КамАЗ", "45143", 6.7, N3, TRUCK);
//        System.out.println(truck2);
//        System.out.println(truck3);
//        System.out.println(truck4);
//        truck3.printType();
        Driver<Truck> driverCategoryC1 = new Driver<>("Пучков Мирон Игнатьевич", "имеется", 20, truck1, DRIVER_LICENSE_CATEGORY_C);
        Driver<Truck> driverCategoryC2 = new Driver<>("Красин Виктор Иванович", "имеется", 20, truck2, DRIVER_LICENSE_CATEGORY_C);
        Driver<Truck> driverCategoryC3 = new Driver<>("Зимин Валерий Эдуардович", "имеется", 20, truck3, DRIVER_LICENSE_CATEGORY_C);
        Driver<Truck> driverCategoryC4 = new Driver<>("Квасин Василий Петрович", "имеется", 20, truck4, DRIVER_LICENSE_CATEGORY_C);
//        System.out.println(driverCategoryC1);
        Mechanic mechanic1 = new Mechanic("Пушкин Егор", "Мастер", Mechanic.TransportType.CAR);
        Mechanic mechanic2 = new Mechanic("Крупов Матвей", "Ремонт машин", Mechanic.TransportType.TRUCK);
        Mechanic mechanic3 = new Mechanic("Носов Глеб", "Авторемонт", Mechanic.TransportType.ALL);
        Mechanic mechanic4 = new Mechanic("Вишняков Алексей", "ДомАвто", Mechanic.TransportType.BUS);


//        List<Transport> vehicle = new ArrayList<>();
//        vehicle.add(audi);
//        vehicle.add(bMW);
//        vehicle.add(kia);
//        vehicle.add(hyundai);
//        vehicle.add(bus1);
//        vehicle.add(bus2);
//        vehicle.add(bus3);
//        vehicle.add(bus4);
//        vehicle.add(truck1);
//        vehicle.add(truck2);
//        vehicle.add(truck3);
//        vehicle.add(truck4);
//        System.out.println(vehicle);
//
        List<Driver> driver = new ArrayList<Driver>();
        driver.add(driverCategoryB1);
        driver.add(driverCategoryB2);
        driver.add(driverCategoryC1);
        driver.add(driverCategoryC2);
        driver.add(driverCategoryD1);
        driver.add(driverCategoryD2);
//        System.out.println(driver);
//
//        audi.addMechanic(mechanic1);
//        bus1.addMechanic(mechanic4);
//        truck1.addMechanic(mechanic2);
//        truck3.addMechanic(mechanic3);
//
//        for (Driver drivers : driver) {
//            System.out.println(drivers + "\n Обслуживанием автомобиля занимаются механики: \n" + Transport.getMechanics());
//        }
//
//        ServiceStation serviceStation = new ServiceStation();
//
//        serviceStation.addCarQueue(audi);
//        serviceStation.addCarQueue(bus2);
//        serviceStation.addCarQueue(truck1);
//
//        serviceStation.carryOutVehicle();
//
//        Map<Transport, Mechanic> carMechanicMap = new HashMap<>();
//        carMechanicMap.put(audi, mechanic1);
//        carMechanicMap.put(bMW, mechanic1);
//        carMechanicMap.put(bus1, mechanic3);
//        carMechanicMap.put(bus1, mechanic3);
//        carMechanicMap.put(bus2, mechanic4);
//        carMechanicMap.put(truck1, mechanic2);
//        carMechanicMap.put(truck2, mechanic3);
//
//        System.out.println(carMechanicMap);
//        for (Map.Entry<Transport, Mechanic> mechanicEntry : carMechanicMap.entrySet()) {
//            System.out.println("Ремонт трансортного средства: "+ pair.getKey() + " осуществляется механиком " + pair.getValue());
//        }
        Set<Driver> drivers = new HashSet<Driver>();
        drivers.add(driverCategoryB1);
        drivers.add(driverCategoryB1);
        drivers.add(driverCategoryB2);
        drivers.add(driverCategoryC1);
        drivers.add(driverCategoryC2);
        drivers.add(driverCategoryD1);
        drivers.add(driverCategoryD2);

        System.out.println(drivers);

        Iterator<Driver> driverIterator = driver.iterator();

        while (driverIterator.hasNext()){
            Driver next = driverIterator.next();
        System.out.println(next);}
    }


    public static void getDiagnosed(Transport... transports) {
        for (Transport transport : transports) {
            try {
                Bus.getDiagnosed();
            } catch (UnsupportedOperationException e) {
                System.out.println("Произошла ошибка диагностики");
                System.out.println(e.getMessage());
            }
        }
    }
}

