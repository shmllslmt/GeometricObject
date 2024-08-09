public class Rectangle extends GeometricObject {
    private double width;
    private double length;

    Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }
    @Override
    public double calcArea() {
        return width * length;
    }

    @Override
    public double calcPerimeter() {
        return width + width + length + length;
    }
}
