package Car;

public abstract class Car {
    private String model;
    private String carClass;
    private double weight;
    private Engine engine;

    public Car(String model, String carClass, double weight, Engine engine) {
        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
    }

    public String getModel() {
        return this.model;
    }

    public String getCarClass() {
        return this.carClass;
    }

    public double getWeight() {
        return this.weight;
    }

    public Engine getEngine() {
        return this.engine;
    }
    public abstract void start();
    public abstract void stop();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public abstract void printInfo();
}