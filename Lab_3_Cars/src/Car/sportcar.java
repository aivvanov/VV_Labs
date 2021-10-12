package Car;

public class sportcar extends Car {
    private double topSpeed;

    public sportcar(String model, String carClass, double weight, Engine engine, double topSpeed) {
        super(model, carClass, weight, engine);
        this.topSpeed = topSpeed;
    }

    public void start() {
        System.out.println("Спорткар поехал");
    }

    public void stop() {
        System.out.println("Спорткар остановился");
    }

    public void printInfo() {
        System.out.println("Модель " + this.getModel());
        System.out.println("Класс: " + this.getCarClass());
        System.out.println("Вес: " + this.getWeight());
        System.out.println("Мощность: " + this.getEngine().getPower());
        System.out.println("Производительность: " + this.getEngine().getPerfom());
        System.out.println("Макс. скорость: " + this.topSpeed);
    }
}
