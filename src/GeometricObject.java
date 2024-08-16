public abstract class GeometricObject {
    private String color;
    private boolean filled;

    protected GeometricObject() {
        this.color = "White";
        this.filled = true;
    }
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
    public abstract double calcArea();
    public abstract double calcPerimeter();

}
