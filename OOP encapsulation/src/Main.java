import Driver.Driver;
import Driver.DriverCategoryB;
import Driver.DriverCategoryC;
import Driver.DriverCategoryD;
import transport.Bus;
import transport.Car;
import transport.Transport;
import transport.Truck;

import java.time.LocalDate;
import java.util.Calendar;

import static Driver.Driver.DriverLicenseCategory.*;
import static transport.Car.BodyType.*;
import static transport.Truck.VehicleType.TRUCK;

public class Main {
    public static void main(String[] args) {



        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, SEDAN, null);
        Car bMW = new Car("BMW", "Z8", 3.0, CROSSOVER, Car.VehicleType.PASSENGER_CAR);
        Car kia = new Car("Kia", "Sportage", 2.4, HATCHBACK, Car.VehicleType.PASSENGER_CAR);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, MINIVAN, Car.VehicleType.PASSENGER_CAR);

//        System.out.println(audi);
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
        Bus bus1 = new Bus("Asia", "Combi", 3.6, Bus.NumberOfSeats.ESPECIALLY_SMALL, Bus.VehicleType.BUS);
        Bus bus2 = new Bus("Asia", "Cosmos", 3.5, Bus.NumberOfSeats.MIDDLE, Bus.VehicleType.BUS);
        Bus bus3 = new Bus("ПАЗ", "4234", 3.0, Bus.NumberOfSeats.BIG, Bus.VehicleType.BUS);
        Bus bus4 = new Bus("Вектор", "Next", 4.4, null, Bus.VehicleType.BUS);

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

        Truck truck1 = new Truck("Shacman", "SX3318", 10.8, Truck.LoadLimit.N1, TRUCK);
        Truck truck2 = new Truck("Volvo", "FL", 7.0, Truck.LoadLimit.N2, TRUCK);
        Truck truck3 = new Truck("Hyundai", "HD78", 3.9, Truck.LoadLimit.N3, TRUCK);
        Truck truck4 = new Truck("КамАЗ", "45143", 6.7, null, TRUCK);
//        System.out.println(truck2);
//        System.out.println(truck3);
//        System.out.println(truck4);
//        truck3.printType();
        Driver<Truck> driverCategoryC1 = new Driver<>("Пучков Мирон Игнатьевич", "имеется", 20, truck1, DRIVER_LICENSE_CATEGORY_C);
        Driver<Truck> driverCategoryC2 = new Driver<>("Красин Виктор Иванович", "имеется", 20, truck2, DRIVER_LICENSE_CATEGORY_C);
        Driver<Truck> driverCategoryC3 = new Driver<>("Зимин Валерий Эдуардович", "имеется", 20, truck3, DRIVER_LICENSE_CATEGORY_C);
        Driver<Truck> driverCategoryC4 = new Driver<>("Квасин Василий Петрович", "имеется", 20, truck4, DRIVER_LICENSE_CATEGORY_C);
//        System.out.println(driverCategoryC1);
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

