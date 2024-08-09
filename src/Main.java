public class Main {
    public static void main(String[] args) {
        GeometricObject object1 = new Circle(5.0);
        System.out.println("Area: " + object1.calcArea());

        GeometricObject object2 = new Rectangle(5.0, 10.0);
        System.out.println("Area: " + object2.calcArea());

        if(object1 instanceof Circle)
            System.out.println("It is an instance of Circle");
        if(object1 instanceof Rectangle)
            System.out.println("It is an instance of Rectangle");
        if(object1 instanceof GeometricObject)
            System.out.println("It is an instance of Geometric Object");

        Circle circle = (Circle) object1;
        GeometricObject object3 = circle;
        Rectangle rectangle = (Rectangle) object2;

        System.out.println("Perimeter: " + circle.calcPerimeter());
        System.out.println("Perimeter: " + object3.calcPerimeter());
        System.out.println("Rectangle's Perimeter: " + rectangle.calcPerimeter());

        if(circle instanceof Circle)
            System.out.println("It is an instance of Circle");
        if(circle instanceof GeometricObject)
            System.out.println("It is an instance of Geometric Object");

        if(rectangle instanceof Rectangle)
            System.out.println("It is an instance of Rectangle");
        if(rectangle instanceof GeometricObject)
            System.out.println("It is an instance of Geometric Object");
    }
}