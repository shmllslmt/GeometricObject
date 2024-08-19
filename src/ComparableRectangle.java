public class ComparableRectangle extends  Rectangle implements Comparable, Cloneable, Printable {
    ComparableRectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public int compareTo(Object o) {
        ComparableRectangle temp = (ComparableRectangle)o;

        if(this.calcArea() > temp.calcArea())
            return 1;
        else if (this.calcArea() < temp.calcArea())
            return -1;
        else
            return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void printInfo() {
        System.out.println("Length: "+super.getLength());
        System.out.println("Width: "+super.getWidth());
        System.out.println("Area: "+super.calcArea());
        System.out.println("Perimeter: "+super.calcPerimeter());
    }
}
