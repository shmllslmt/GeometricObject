public class ComparableRectangle extends Rectangle implements Comparable {
    protected ComparableRectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public int compareTo(Object o) {
        if(this.calcArea() > ((ComparableRectangle)o).calcArea())
            return 1;
        else if (this.calcArea() < ((ComparableRectangle)o).calcArea())
            return -1;
        else
            return 0;
    }
}
