public class Circle extends TwoDShape {

    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double area() {
        return Math.PI*Math.pow(radius, 2);
    }
}