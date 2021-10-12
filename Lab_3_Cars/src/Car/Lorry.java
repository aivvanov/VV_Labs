package Car;

public class Lorry extends Car {
    private double waightlift;

    public Lorry(String model, String carClass, double weight, Engine engine, double waightlift) {
        super(model, carClass, weight, engine);
        this.waightlift = waightlift;
    }

    public void start() {
        System.out.println("Грузовик поехал");
    }

    public void stop() {
        System.out.println("Грузовик остановился");
    }

    public void printInfo() {
        System.out.println("Модель: " + this.getModel());
        System.out.println("Класс автомобиля: " + this.getCarClass());
        System.out.println("Вес: " + this.getWeight());
        System.out.println("Мотор: " + this.getEngine().getPower());
        System.out.println("Производительность: " + this.getEngine().getPerfom());
        System.out.println("Грузоподъемность: " + this.waightlift);
    }
}
