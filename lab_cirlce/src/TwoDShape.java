public abstract class TwoDShape {
    private double x;
    private double y;

    public TwoDShape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public abstract double area();
}