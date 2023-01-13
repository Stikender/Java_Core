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

import static transport.Car.BodyType.*;

public class Main {
    public static void main(String[] args) {

//        Flower rosa = new Flower(null, "Голландия", 35.59);
//        Flower khrizantema = new Flower(null, null, 15,5);
//        Flower pion = new Flower(null, "Англия", 69.9, 1);
//        Flower gipsofila = new Flower(null, "Турция", 19.5, 10);
//        printInfoFlower(rosa);
//        printInfoFlower(khrizantema);
//        printInfoFlower(pion);
//        printInfoFlower(gipsofila);
//
//        printCostSumFlower(
//                rosa, rosa,rosa,
//                khrizantema, khrizantema, khrizantema, khrizantema,khrizantema,
//                gipsofila
//        );
//
//        Car lada = new Car("Lada", "Granta", "желтый", 2020, "Россия",
//                1.6,  180, "Автоматическая", "универсал", "А365АБ777", 5,false,
//                new Car.Key(false,true), new Car.Insurance(LocalDate.now(), 5000, "2555666952"));
//        System.out.println(lada);

//        Bus bus1 = new Bus("Asia", "Combi", "red", 2020, "South Korea", 120, 16);
//        Bus bus2 = new Bus("Asia", "Cosmos", "yellow", 2015, "South Korea", 120, 32);
//        Bus bus3 = new Bus("ПАЗ", "4234", null, 2016, "Россия", 100, 18);

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, СЕДАН, null);
        Car bMW = new Car("BMW", "Z8", 3.0, КРОССОВЕР, Car.VehicleType.ЛЕГКОВОЙ_АВТОМОБИЛЬ);
        Car kia = new Car("Kia", "Sportage", 2.4, ХЕТЧБЕК, Car.VehicleType.ЛЕГКОВОЙ_АВТОМОБИЛЬ);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, МИНИВЭН, Car.VehicleType.ЛЕГКОВОЙ_АВТОМОБИЛЬ);

        System.out.println(audi);
        System.out.println(bMW);
        System.out.println(kia);
        System.out.println(hyundai);
        audi.printType();
//        audi.bestLapTime();
        Driver<Car> driverCategoryB1 = new Driver<>("Петров Николай Иванович", "имеется", 10, audi);
        Driver<Car> driverCategoryB2 = new Driver<>("Сидоров Мамай Игнатович", "имеется", 15, bMW);
        Driver<Car> driverCategoryB3 = new Driver<>("Петров Григорий Константинович", "имеется", 5, kia);
        Driver<Car> driverCategoryB4 = new Driver<>("Ткаченко Альберт Владимирович", "имеется", 12, hyundai);
        System.out.println(driverCategoryB1);
        System.out.println(driverCategoryB2);
        System.out.println(driverCategoryB3);
        System.out.println(driverCategoryB4);

        Bus bus1 = new Bus("Asia", "Combi", 3.6, Bus.NumberOfSeats.СРЕДНЯЯ, Bus.VehicleType.АВТОБУС);
        Bus bus2 = new Bus("Asia", "Cosmos", 3.5, Bus.NumberOfSeats.МАЛАЯ, Bus.VehicleType.АВТОБУС);
        Bus bus3 = new Bus("ПАЗ", "4234", 3.0, Bus.NumberOfSeats.БОЛЬШАЯ, Bus.VehicleType.АВТОБУС);
        Bus bus4 = new Bus("Вектор", "Next", 4.4,null, Bus.VehicleType.АВТОБУС);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);
        bus1.printType();
        Driver<Bus> driverCategoryD1 = new Driver<>("Мусинов Иван Давыдович", "имеется", 2, bus1);
        Driver<Bus> driverCategoryD2 = new Driver<>("Печной Леонид Петрович", "имеется", 7, bus2);
        Driver<Bus> driverCategoryD3 = new Driver<>("Пеньков Василий Львович", "имеется", 17, bus3);
        Driver<Bus> driverCategoryD4 = new Driver<>("Васильев Владимир Владимирович", "имеется", 7, bus4);
        System.out.println(driverCategoryD1);
        System.out.println(driverCategoryD2);
        System.out.println(driverCategoryD3);
        System.out.println(driverCategoryD4);

        Truck truck1 = new Truck("Shacman", "SX3318", 10.8, Truck.LoadLimit.N1, Truck.VehicleType.ГРУЗОВОЙ_АВТОМОБИЛЬ);
        Truck truck2 = new Truck("Volvo", "FL", 7.0, Truck.LoadLimit.N2, Truck.VehicleType.ГРУЗОВОЙ_АВТОМОБИЛЬ);
        Truck truck3 = new Truck("Hyundai", "HD78", 3.9, Truck.LoadLimit.N3, Truck.VehicleType.ГРУЗОВОЙ_АВТОМОБИЛЬ);
        Truck truck4 = new Truck("КамАЗ", "45143", 6.7, null, Truck.VehicleType.ГРУЗОВОЙ_АВТОМОБИЛЬ);
        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);
        System.out.println(truck4);
        truck3.printType();
        Driver<Truck> driverCategoryC1 = new Driver<>("Пучков Мирон Игнатьевич", "имеется", 20, truck1);
        System.out.println(driverCategoryC1);
    }

//    private static void printInfoFlower(Flower flower) {
//        System.out.println(
//                "Цвет: " + flower.getFlowerColor() +
//                ", страна происхождения: " + flower.getCountry() +
//                ", стоимость: " + flower.getCost() +
//                ", срок стояния цветка: " + flower.lifeSpan);
//    }
//
//    private static void printCostSumFlower(Flower... flowers) {
//        double totalCost = 0;
//        int minLifeSpan = Integer.MAX_VALUE;
//        for (Flower flower : flowers) {
//            if (flower.lifeSpan <= minLifeSpan) {
//                minLifeSpan = flower.lifeSpan;
//            }
//            totalCost += flower.getCost();
//            printInfoFlower(flower);
//        }
//        totalCost = totalCost * 1.1;
//        System.out.println("Стоимость букета: " + totalCost);
//        System.out.println("Срок стояния букета: " + minLifeSpan);
//    }
}