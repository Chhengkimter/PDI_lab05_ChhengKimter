package Ex6;

public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double surface() {
        return 3.14 * r * r;
    }

    public double perimeter() {
        return 2 * 3.14 * r;
    }
}
