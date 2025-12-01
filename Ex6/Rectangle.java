package Ex6;

public class Rectangle {
    private double w;
    private double h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    public double area() {
        return w * h;
    }

    public double perimeter() {
        return 2 * (w + h);
    }
}
