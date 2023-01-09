package transport;

public class Truck extends Transport{
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль: " + getBrand() +
                " " + getModel() +
                ", объем двигателя — " + getEngineVolume ();
    }

    public void startMoving() {
        System.out.println("Проверка груза");
        System.out.println("Вставляем ключ в замок зажигания");
        System.out.println("Заводим автомобиль");
        System.out.println("Включаем скорость, жмем педаль газа");
        System.out.println("Автомобиль начинает движение");
        super.startMoving();
    }

    public void stopMoving() {
        super.stopMoving();
    }

}
