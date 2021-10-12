package Car;

public class Engine {
    private double power;
    private String perfom;

    public Engine(double power, String perfom) {
        this.power = power;
        this.perfom = perfom;
    }

    public double getPower() {
        return this.power;
    }

    public String getPerfom() {
        return this.perfom;
    }
}
