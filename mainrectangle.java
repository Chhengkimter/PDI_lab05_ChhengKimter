
public class mainrectangle {
    public static void main(String[] args) {
        // Test Rectangle
        Rectangle rect = new Rectangle(5.0, 10.0);
        System.out.println("Rectangle:");
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());

        // Modify using setters
        rect.setWidth(7.0);
        rect.setHeight(12.0);
        System.out.println("After modification - Area: " + rect.calculateArea() + ", Perimeter: " + rect.calculatePerimeter());

        System.out.println();

        // Test Circle
        Circle circ = new Circle(3.0);
        System.out.println("Circle:");
        System.out.println("Radius: " + circ.getRadius());
        System.out.println("Area: " + circ.calculateArea());
        System.out.println("Perimeter: " + circ.calculatePerimeter());

        // Modify using setter
        circ.setRadius(5.0);
        System.out.println("After modification - Area: " + circ.calculateArea() + ", Perimeter: " + circ.calculatePerimeter());
    }
}

