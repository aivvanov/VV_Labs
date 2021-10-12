package Flower;

public class Main {
    public static void main(String[] args) {
        double total = 0;
        Rouse rouse = new Rouse(120.0, "Роза");
        Rouse rouse2 = new Rouse(120.0, "Роза");
        Carnation carnation = new Carnation(150.5, "Гвоздика");
        Chamomile chamomile = new Chamomile(85.5, "Ромашка");
        System.out.println("Цена букета = " + Flower.total);
        System.out.println("Количество проданных цветов = " + Flower.sum);
    }
}
