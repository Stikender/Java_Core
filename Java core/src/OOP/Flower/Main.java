package OOP.Flower;

public class Main {
    public static void main(String[] args) {

        Flower rosa = new Flower(null, "Голландия", 35.59);
        Flower khrizantema = new Flower(null, null, 15,5);
        Flower pion = new Flower(null, "Англия", 69.9, 1);
        Flower gipsofila = new Flower(null, "Турция", 19.5, 10);
        printInfoFlower(rosa);
        printInfoFlower(khrizantema);
        printInfoFlower(pion);
        printInfoFlower(gipsofila);

        printCostSumFlower(
                rosa, rosa,rosa,
                khrizantema, khrizantema, khrizantema, khrizantema,khrizantema,
                gipsofila
        );
    }
    private static void printInfoFlower(Flower flower) {
        System.out.println(
                "Цвет: " + flower.getFlowerColor() +
                ", страна происхождения: " + flower.getCountry() +
                ", стоимость: " + flower.getCost() +
                ", срок стояния цветка: " + flower.lifeSpan);
    }

    private static void printCostSumFlower(Flower... flowers) {
        double totalCost = 0;
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan <= minLifeSpan) {
                minLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            printInfoFlower(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("Срок стояния букета: " + minLifeSpan);
    }
}
