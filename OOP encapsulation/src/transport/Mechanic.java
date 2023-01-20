package transport;

import java.util.Objects;

public class Mechanic {

    private String name;
    private String company;
    private TransportType type;

    public Mechanic(String name, String company, TransportType type) {
        this.name = name;
        this.company = company;
        this.type = type;
    }
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getCompany() { return company; }

    public void setCompany(String company) { this.company = company; }

    public TransportType getType() { return type; }

    public void setType(TransportType type) { this.type = type; }

    @Override
    public String toString() {
        return " " + getName() + " работает в компании " +
                getCompany();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mechanic)) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(getName(), mechanic.getName()) && Objects.equals(getCompany(), mechanic.getCompany()) && getType() == mechanic.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCompany(), getType());
    }

    public enum TransportType {

        CAR,
        BUS,
        TRUCK,
        ALL
    }
    public void carryOutMaintenance() {
        System.out.println("Выполнить техническое обслуживание механику " + getName() + " из компании " + getCompany());
    }
        public void vehicleRepair() {
            System.out.println("Выполнить ремонт транспортного средства механику" + getName() +" из компании " + getCompany());
    }
}
