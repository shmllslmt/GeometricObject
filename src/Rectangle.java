public class Rectangle extends GeometricObject {
    private int length;
    private int width;

    protected Rectangle() {
        this(0, 0);
    }
    protected Rectangle(int length, int width) {
        this.width = width;
        this.length = length;
    }
    protected Rectangle(String color, boolean filled, int length, int width) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return width + length + width + length;
    }
}
