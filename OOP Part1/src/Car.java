public class Car {

    public String brand;
    public String model;
    public String engineVolume;
    public String color;
    public String year;
    public String country;

    public Car(String brand, String model, String engineVolume, String color, String year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    @Override
    public String toString() {
        return brand +
                " " + model +
                ", " + year +
                " год выпуска, сборка в " + country +
                ", цвет кузова " + color +
                ", объем двигателя — " + engineVolume +
                " л."  ;
    }
}
