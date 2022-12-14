public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1.1, 1.2");
        Human maksim = new Human(1988, "Максим", "Минск", "Бренд-менеджер");
        Human anya = new Human(1993, "Аня", "Москва", "Методист образовательных программ");
        Human katya = new Human(1992, "Катя", "Калининград", "Продакт-менеджер");
        Human artem = new Human(1995, " ", "Москва", "Диреткор по развитию бизнеса");

        System.out.println(maksim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println("Exercise 1.3");
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car bMW = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage", 2.4, "красный", 2018, "Южная корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная корея");

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bMW);
        System.out.println(kia);
        System.out.println(hyundai);

    }
}