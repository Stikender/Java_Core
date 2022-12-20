package transport;

import java.time.LocalDate;

public class Car {

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean tires;
    private Key key;
    private Insurance insurance;


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
        new Key();
        new Insurance();

    }
    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission,
               String bodyType, String registrationNumber, int numberOfSeats, boolean tires, Key key, Insurance insurance) {
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
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;}
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
                this.bodyType = "седан";
            } else {
                this.bodyType = bodyType;}
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber; }
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;}
        this.tires = tires;
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key; }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance; }
    }

    public String getBrand() { return brand; }

    public String getModel() { return model; }

    public int getYear() { return year; }

    public String getCountry() { return country; }

    public String getBodyType() { return bodyType; }

    public int getNumberOfSeats() { return numberOfSeats; }

    public double getEngineVolume() { return engineVolume;  }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() { return color; }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTransmission() { return transmission; }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;}
    }

    public String getRegistrationNumber() { return registrationNumber; }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber; }
    }
    public boolean isTires() { return tires; }
    public void setTires(boolean tires) {
        this.tires = tires;
    }
    public void changeTires() {
        this.tires = !this.tires;
    }

    public boolean correctRegistrationNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0])|| !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3])
                && Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }

    public Key getKey() { return key; }
    public void setKey(Key key) {
        this.key = key;
    }
    public Insurance getInsurance(Insurance insurance) { return this.insurance; }
    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

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
                ", " + (isTires() ? "летняя резина" : "зимняя резина") +
                ", " + (getKey().isRemoteEngineStart() ? "без ключевой доступ" : "нужны ключи") +
        ", " + (getKey().isRemoteEngineStart() ? "удаленный запуск" : "обычный запуск") +
                ", номер страховки " + getInsurance(new Insurance(LocalDate.now(), 30_000, "00999999")).getNumber() +
                ", стоимость страховки " + getInsurance(new Insurance(LocalDate.now(), 30_000, "00999999")).getPrice() +
                ", срок действия страховки " + getInsurance(new Insurance(LocalDate.now(), 30_000, "00999999")).getValidity();
    }

public static class Key {
    private boolean remoteEngineStart;
    private boolean withoutKeyAccess;
    public Key(boolean remoteEngineStart, boolean withoutKeyAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.withoutKeyAccess = withoutKeyAccess;
    }

    public Key() {
        this(true, true);
    }
    public boolean isRemoteEngineStart() {
        return remoteEngineStart;
    }

    public boolean isWithoutKeyAccess() {
        return withoutKeyAccess;
        }

    }
    public static class Insurance {

    private final LocalDate validity;
    private final double price;
    private final String number;
    public Insurance(LocalDate validity, double price, String number) {
        if (validity == null) {
            this.validity = LocalDate.now().plusDays(365);
        } else {
            this.validity = validity;}
            this.price = price;
        if (number == null || number.isEmpty() || number.isBlank()) {
            this.number = "123456789";
        } else {
            this.number = number;}
    }
        public Insurance() {
            this(null, 0, null);
        }

    public LocalDate getValidity() {   return validity;  }

    public double getPrice() {   return price; }

    public String getNumber() {  return number;    }

        public void checkValidity() {
            if (validity.isBefore(LocalDate.now()) || validity.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять страховку");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }
}