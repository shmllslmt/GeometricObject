public class Circle extends GeometricObject {
    private double radius;

    Circle(double radius) {
        super("Yellow", true);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }
}
