public class ComparableCircle extends Circle implements Comparable {
    protected ComparableCircle(double radius) {
        super(radius);
    }
    @Override
    public int compareTo(Object o) {
        if(this.getRadius()>((ComparableCircle)o).getRadius())
            return 1;
        else if(this.getRadius() < ((ComparableCircle)o).getRadius())
            return -1;
        else
            return 0;
    }

}