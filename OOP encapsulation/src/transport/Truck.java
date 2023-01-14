package transport;

public class Truck extends Transport{

    LoadLimit loadLimit;
    VehicleType vehicleType;

    public enum LoadLimit {
        N1(null,3.5f),
        N2(3.5f,12f),
        N3(12f, null);
        private Float lowerLoadLimit;
        private Float upperLoadLimit;

        LoadLimit(Float lowerLoadLimit, Float upperLoadLimit) {
                this.lowerLoadLimit = lowerLoadLimit;
                this.upperLoadLimit = upperLoadLimit;
        }

        public Float getLowerLoadLimit() {
            return lowerLoadLimit;
        }

        public void setLowerLoadLimit(Float lowerLoadLimit) {
            this.lowerLoadLimit = lowerLoadLimit;
        }

        public Float getUpperLoadLimit() {

            return upperLoadLimit;
        }

        public void setUpperLoadLimit(Float upperLoadLimit) {
            this.upperLoadLimit = upperLoadLimit;
        }

        @Override
        public String toString() {
            if (lowerLoadLimit == null) {
                return ", Грузоподъемность: до " + upperLoadLimit + " тонн.";
            } else if (upperLoadLimit == null) {
                return ", Грузоподъемность: от " + lowerLoadLimit + " тонн.";
            } else
            { return ", Грузоподъемность: от " + getLowerLoadLimit() +
                    " тонн до " + getUpperLoadLimit() + " тонн.";}
        }
    }
    public enum VehicleType{
        ГРУЗОВОЙ_АВТОМОБИЛЬ
    }
    public Truck(String brand, String model, double engineVolume, LoadLimit loadLimit, VehicleType vehicleType) {
        super(brand, model, engineVolume);
            this.loadLimit = loadLimit;
            this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        if (loadLimit == null) {
            return "Тип: " + getVehicleType()+ ", " + getBrand() +
                    " " + getModel() +
                    ", объем двигателя — " + getEngineVolume ()
                    + " Не корректное значение";
        } else {
        return "Тип: " + getVehicleType()+ ", " + getBrand() +
                " " + getModel() +
                ", объем двигателя — " + getEngineVolume ()
                + getLoadLimit();}
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
    public LoadLimit getLoadLimit() {
        return loadLimit;
    }
    public void setLoadLimit(LoadLimit loadLimit) {
        this.loadLimit = loadLimit;
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
            System.out.println("Тип траспорта: грузовой транспорт.");
        }
    }

    @Override
    public void getDiagnosed() {
        System.out.println("Вы проехали 10000 км, пора пройти диагностику");
        super.getDiagnosed();
    }
}
