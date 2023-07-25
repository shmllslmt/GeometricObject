public class Main {
    public static void main(String[] args) {
        GeometricObject[] objects = {
                new Cylinder(5.0, 10.0),
                new Rectangle(10, 10),
                new Circle(5),
        };

        for(GeometricObject object: objects) {
            System.out.println("Area: " + object.getArea());
            System.out.println("Perimeter: " + object.getPerimeter());
            if(object instanceof Cylinder)
                System.out.println("Volume: " + ((Cylinder)object).findVolume());
        }
    }
}