import Car.*;

public class Main {
    public static void main(String[] args) {
        Engine el = new Engine(100.0, "ЗИЛ");
        Engine esc = new Engine(200.0, "Ferrari");
        Lorry l = new Lorry("ЗИЛ", "С", 2000, el, 6000);
        sportcar s = new sportcar("f8", "M", 1500, esc, 250);

        l.start();
        l.printInfo();
        l.stop();
        System.out.println();

        s.start();
        s.printInfo();
        s.stop();
    }
}
