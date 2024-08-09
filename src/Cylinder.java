public class Cylinder extends Circle {
    private double height;

    protected Cylinder(double height) {
        super(10.5);
        this.height = height;
    }

    public double calcVolume() {
        return height * super.calcArea();
    }
}
