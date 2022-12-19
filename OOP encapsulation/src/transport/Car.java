package transport;

import java.time.LocalDate;
import java.util.Calendar;

public class Car {

    private final String brand;
    private final String model;
    private final double engineVolume;
    private final String color;
    private final int year;
    private final String country;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean tires;
    public static class Key {
        private String remoteEngineStart;
        private String withoutKeyAccess;

        public Key(String remoteEngineStart, String withoutKeyAccess) {
            if (remoteEngineStart == null || remoteEngineStart.isEmpty() || remoteEngineStart.isBlank()) {
                this.remoteEngineStart = "default";
            } else {
                this.remoteEngineStart = remoteEngineStart;}
            if (withoutKeyAccess == null || withoutKeyAccess.isEmpty() || withoutKeyAccess.isBlank()) {
                this.withoutKeyAccess = "default";
            } else {
                this.withoutKeyAccess = withoutKeyAccess;}

        }

        public String isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }

    public static class Insurance {
        private String validity;
        private int price;
        private String number;

        public Insurance(String validity, int price, String number) {
            if (validity == null || validity.isEmpty() || validity.isBlank()) {
                this.validity = "default";
            } else {
                this.validity = validity;}
            if (price <0 ) {
                this.price = 10_000;
            } else {
                this.price = price;}
            if (number == null || number.isEmpty() || number.isBlank()) {
                this.number = "default";
            } else {
            this.number = number;}
        }

        public String getValidity() {
            return validity;
        }

        public void setValidity(String validity) {
            this.validity = validity;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            if (number.length() != 9) {
                System.out.println("Номер страховки не корректный");
            } else {
                this.number = number;
            }
        }
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission,
               String bodyType, String registrationNumber, int numberOfSeats, boolean tires) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;}
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
                this.bodyType = "default";
            } else {
                this.bodyType = bodyType;}
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber; }
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 2;
        } else {
            this.numberOfSeats = numberOfSeats;}
        this.tires = tires;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() { return color; }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() { return transmission; }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isTires() {
        return tires;
    }

    public void setTires(boolean tires) {
        this.tires = tires;
    }

    public void changeTires() {
        this.tires = !this.tires;
    }

//    public void correctRegistrationNumber(String registrationNumber) {
//        char[0]
//    }

    @Override
    public String toString() {
        return getBrand() +
                " " + getModel() +
                ", " + getYear() +
                " год выпуска, сборка в " + getCountry() +
                ", цвет кузова " + getColor () +
                ", объем двигателя — " + getEngineVolume () +
                " л. Коробка передач " + getTransmission () +
                ", тип кузова " + getBodyType () +
                ", регистрационный номер " + getRegistrationNumber () +
                ", количество мест " + getNumberOfSeats () +
                ", " + (isTires() ? "летняя резина" : "зимняя резина");
    }
}
