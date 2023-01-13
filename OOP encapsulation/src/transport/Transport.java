package transport;

import java.util.Objects;

public abstract class Transport implements Competing{

    private final String brand;
    private final String model;
//    private String color;
//    private final int year;
//    private final String country;
//    private double maxSpeed;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
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
    }

    public Transport(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    //    public Transport(String brand, String model, String color, int year, String country, double maxSpeed) {
//        if (brand == null || brand.isEmpty() || brand.isBlank()) {
//            this.brand = "default";
//        } else {
//            this.brand = brand;
//        }
//        if (model == null || model.isEmpty() || model.isBlank()) {
//            this.model = "default";
//        } else {
//            this.model = model;
//        }
//        if (year <= 0) {
//            this.year = 2000;
//        } else {
//            this.year = year;
//        }
//        if (country == null || country.isEmpty() || country.isBlank()) {
//            this.country = "default";
//        } else {
//            this.country = country;
//        }
//        if (color == null || color.isEmpty() || color.isBlank()) {
//            this.color = "белый";
//        } else {
//            this.color = color;}
//        if (maxSpeed <= 0) {
//            this.maxSpeed = 50;
//        } else {
//        this.maxSpeed = maxSpeed;}
//    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.getEngineVolume(), getEngineVolume()) == 0 && Objects.equals(getBrand(), transport.getBrand()) && Objects.equals(getModel(), transport.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getEngineVolume());
    }

    @Override
    public String toString() {
        return "Транспорт " + brand+ ' ' + model +
                ", объем двигателя: " + engineVolume;
    }

    public void startMoving() {
    }

    public void stopMoving() {
        System.out.println("Осуществляем парковку");
        System.out.println("Глушим автомобиль");
    }

    @Override
    public String[] pitStop() {
        return new String[] {"Остановка в месте обслуживания", "Заправка автомобиля, замена шин", "Разрешено продолжить заезд!"};
    }

    @Override
    public void bestLapTime() {
        System.out.println("Вы едете первым!");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Вы самый быстрый!");
    }

    public abstract void printType();


    //    public int getYear() {
//        return year;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        if (color == null || color.isEmpty() || color.isBlank()) {
//            this.color = "белый";
//        } else {
//            this.color = color;}
//    }
//
//    public double getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public void setMaxSpeed(double maxSpeed) {
//        if (maxSpeed <= 0) {
//            this.maxSpeed = 50;
//        } else {
//            this.maxSpeed = maxSpeed;}
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Transport)) return false;
//        Transport transport = (Transport) o;
//        return getYear() == transport.getYear() && Double.compare(transport.getMaxSpeed(), getMaxSpeed()) == 0 && Objects.equals(getBrand(), transport.getBrand()) && Objects.equals(getModel(), transport.getModel()) && Objects.equals(getColor(), transport.getColor()) && Objects.equals(getCountry(), transport.getCountry());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getBrand(), getModel(), getColor(), getYear(), getCountry(), getMaxSpeed());
//    }
//
//    @Override
//    public String toString() {
//        return getBrand() +
//                " " + getModel() +
//                ", цвет кузова " + getColor () +
//                ", " + getYear() +
//                " год выпуска, сборка в " + getCountry() +
//                ", максимальная скорость: " + getMaxSpeed();
//    }
}
