package transport;

import Driver.NoInformationProvided;

public class Bus extends Transport{

    NumberOfSeats numberOfSeats;
    VehicleType vehicleType;

    public enum NumberOfSeats {
        ОСОБО_МАЛАЯ(null,10),
        МАЛАЯ(10,25),
        СРЕДНЯЯ(40,50),
        БОЛЬШАЯ(60,80),
        ОСОБО_БОЛЬШАЯ(100,120);

        private Integer minNumberOfSeats;
        private Integer maxNumberOfSeats;

        NumberOfSeats(Integer minNumberOfSeats, Integer maxNumberOfSeats) {
            this.minNumberOfSeats = minNumberOfSeats;
            this.maxNumberOfSeats = maxNumberOfSeats;
        }

        public Integer getMinNumberOfSeats() {
            return minNumberOfSeats;
        }
        public void setMinNumberOfSeats(Integer minNumberOfSeats) {
            this.minNumberOfSeats = minNumberOfSeats;
        }
        public Integer getMaxNumberOfSeats() {
            return maxNumberOfSeats;
        }
        public void setMaxNumberOfSeats(Integer maxNumberOfSeats) {
            this.maxNumberOfSeats = maxNumberOfSeats;
        }

        @Override
        public String toString() {
            if (minNumberOfSeats == null) {
               return ", Вместимость автобуса до " + maxNumberOfSeats +" человек.";
            }
            else if (maxNumberOfSeats == null) {
                return ", Вместимость автобуса от " + minNumberOfSeats + " человек.";
            } else {
                return ", Вместимость автобуса от " + minNumberOfSeats +
                        " человек до " + maxNumberOfSeats +" человек.";
            }
        }
    }
    public enum VehicleType{
        АВТОБУС
    }

    public Bus(String brand, String model, double engineVolume, NumberOfSeats numberOfSeats, VehicleType vehicleType) {
        super(brand, model, engineVolume);
        this.numberOfSeats = numberOfSeats;
        this.vehicleType = vehicleType;
    }
    @Override
    public String toString() {
        if (numberOfSeats == null) {
            return "Тип: " + getVehicleType() +", " + getBrand() +
                    " " + getModel() +
                    ", объем двигателя — " + getEngineVolume ()
                    + ". Не корректное значение.";
        } else {
        return "Тип: " + getVehicleType() +", " + getBrand() +
                " " + getModel() +
                ", объем двигателя — " + getEngineVolume ()
                + getNumberOfSeats();}
    }

    public void startMoving() {
        System.out.println("Вставляем ключ в замок зажигания");
        System.out.println("Заводим автомобиль");
        System.out.println("Проверяем безопасность пассажиров");
        System.out.println("Включаем скорость, жмем педаль газа");
        System.out.println("Автомобиль начинает движение");
        super.startMoving();
    }

    public void stopMoving() {
        super.stopMoving();
    }

    public NumberOfSeats getNumberOfSeats() {

        return numberOfSeats;
    }

    public void setNumberOfSeats(NumberOfSeats numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
    public void printType() {
        if (vehicleType == null) {
            System.out.println("Данных по транспортному средству недостаточно.");}
        else {
            System.out.println("Тип траспорта: автобус");
        }
    }
    public static void getDiagnosed() {
            throw new UnsupportedOperationException("Автобус диагностике не подлежит");
        }

    //    private int numberOfSeats;
//
//    public Bus(String brand, String model, String color, int year, String country, double maxSpeed, int numberOfSeats) {
//        super(brand, model, color, year, country, maxSpeed);
//        if (numberOfSeats <= 0) {
//            this.numberOfSeats = 5;
//        } else {
//            this.numberOfSeats = numberOfSeats;}
//    }
//
//    public int getNumberOfSeats() {
//        return numberOfSeats;
//    }
//
//    public void setNumberOfSeats(int numberOfSeats) {
//        this.numberOfSeats = numberOfSeats;
//    }
//
//    @Override
//    public String toString() {
//        return "Автобус: " + getBrand() +
//                " " + getModel() +
//                ", цвет кузова " + getColor () +
//                ", " + getYear() +
//                " год выпуска, сборка в " + getCountry() +
//                ", максимальная скорость: " + getMaxSpeed() +
//                "количество мест для сидения " + getNumberOfSeats();
//    }
}
