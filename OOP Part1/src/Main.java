public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(1988, "Максим", "Минск", "Бренд-менеджер");
        Human anya = new Human(1993, "Аня", "Москва", "Методист образовательных программ");
        Human katya = new Human(1992, "Катя", "Калининград", "Продакт-менеджер");
        Human artem = new Human(1995, "Артем", "Москва", "Диреткор по развитию бизнеса");

        System.out.println(maksim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
    }
}