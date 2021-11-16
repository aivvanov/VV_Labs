public class Main {
    public static void main(String[] args) {

        Apple app1 = new Apple();
        Orange orange1 = new Orange();
        System.out.println(app1.getWeight());
        System.out.println(orange1.getWeight());

        Box<Apple> appleBox = new Box<Apple>(app1, 6);
        System.out.println("Вес коробки с яблоками = " + appleBox.getWeight());
        Box<Orange> orangeBox = new Box<Orange>(orange1, 4);
        System.out.println("Вес коробки с апельсинами = " + orangeBox.getWeight());

        System.out.println();
        System.out.println("Веса коробок равны? -" + orangeBox.compare(appleBox));

    }
}
