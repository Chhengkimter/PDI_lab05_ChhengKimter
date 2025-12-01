class Rectangle {

	private double width;
    private double height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public double area() {
		return width*height;
	}
	public double perimeter() {
		return 2*(width*height);
	}

}
class Circle {
    private double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double calculateSurface() {
        return Math.PI * radius * radius;
    }
    
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle Information:");
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
        System.out.println("\n");
        
        System.out.println("Rectangle Information after modified:");
        rect.setWidth(7.0);
        rect.setHeight(4.0);
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
        System.out.println("\n");
        
        Circle circle = new Circle(4.0);
        System.out.println("Circle information:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Surface Area: " + circle.calculateSurface());
        System.out.println("Perimeter (Circumference): " + circle.calculatePerimeter());
        System.out.println("\n");
        
        System.out.println("Rectangle Information after modified:");
        circle.setRadius(20);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Surface Area: " + circle.calculateSurface());
        System.out.println("Perimeter (Circumference): " + circle.calculatePerimeter());
//        double test;
//        test = circle.calculatePerimeter();
//        System.out.println("new perimeter: "+ (test+300));
	}
}
