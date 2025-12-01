package Ex6;

public class Test {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0);
        Circle circle = new Circle(4.0);

        System.out.println("Rectangle:");
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());

        System.out.println("\nCircle:");
        System.out.println("Area: " + circle.surface());
        System.out.println("Perimeter: " + circle.perimeter());
    }
}
