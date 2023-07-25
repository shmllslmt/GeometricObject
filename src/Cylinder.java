public class Cylinder extends Circle {
    private double length;

    protected Cylinder() {
        this(0.0);
    }
    protected Cylinder(double length) {
        this.length = length;
    }
    protected Cylinder(double radius, double length) {
        super(radius);
        this.length = length;
    }
    protected Cylinder(String color, boolean filled, double radius, double length) {
        super(color, filled, radius);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume() {
        return getArea() * length;
    }
}
