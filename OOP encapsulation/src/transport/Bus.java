package transport;

public class Bus extends Transport{

    private int numberOfSeats;

    public Bus(String brand, String model, String color, int year, String country, double maxSpeed, int numberOfSeats) {
        super(brand, model, color, year, country, maxSpeed);
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;}
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Автобус: " + getBrand() +
                " " + getModel() +
                ", цвет кузова " + getColor () +
                ", " + getYear() +
                " год выпуска, сборка в " + getCountry() +
                ", максимальная скорость: " + getMaxSpeed() +
                "количество мест для сидения " + getNumberOfSeats();
    }
}
