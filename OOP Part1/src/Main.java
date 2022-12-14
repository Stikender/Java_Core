public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1.1, 1.2");
        Human maksim = new Human(1988, "Максим", "Минск", "Бренд-менеджер");
        Human anya = new Human(1993, "Аня", "Москва", "Методист образовательных программ");
        Human katya = new Human(1992, "Катя", "Калининград", "Продакт-менеджер");
        Human artem = new Human(1995, "Артем", "Москва", "Диреткор по развитию бизнеса");

        System.out.println(maksim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
//        Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя — 3,0 л.
//       BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
//       Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
//       Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016 год.
        System.out.println("Exercise 1.3");
        Car lada = new Car("Lada", "Granta", "1.7", "желтый", "2015", "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", "3.0", "черный", "2020", "Германия");
        Car bMW = new Car("BMW", "Z8", "3.0", "черный", "2021", "Германия");
        Car kia = new Car("Kia", "Sportage", "2.4", "красный", "2018", "Южная корея");
        Car hyundai = new Car("Hyundai", "Avante", "1.6", "оранжевый", "2016", "Южная корея");

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bMW);
        System.out.println(kia);
        System.out.println(hyundai);

    }
}