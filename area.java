import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateAreaRectangle() {
        return length * width;
    }

    public double calaculatePerimeterRectangle() {
        return 2 * (length + width);
    }

    public void display() {
        System.out.println("\nRectangle");
        System.out.println("Area: " + calculateAreaRectangle());
        System.out.println("Perimeter: " + calaculatePerimeterRectangle());
    }

}

class Circle {
    
    private double radius;
    
    public Circle(double radius) {
        setRadius(radius);
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateAreaCircle() {
        return Math.PI * radius * radius;
    }

    public double calculateSurfaceCircle() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("\nCircle");
        System.out.println("Area: " + calculateAreaCircle());
        System.out.println("Surface: " + calculateSurfaceCircle());
}
public class area {
    public static void main(String[] args) {
     
        Scanner Gojo = new Scanner(System.in);

        System.out.print("1 for rectangle or 2 for Circle?: ");
        int choice = Gojo.nextInt();

        switch(choice) {
            case 1:
                System.out.print("Enter length: ");
                double length = Gojo.nextDouble();
                System.out.print("Enter width: ");
                double width = Gojo.nextDouble();
                
                Rectangle rect = new Rectangle(length, width);
                rect.display();
                break;
            case 2:
                System.out.println("Enter radius: ");
                double radius = Gojo.nextDouble();
                
                Circle circle = new Circle(radius);
                circle.display();
                break;
            default:
                System.out.println("Invalid choice");
        }
        
        Gojo.close();
    }
}
}
