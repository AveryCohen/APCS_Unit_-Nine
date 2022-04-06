public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
        super();
        width = 10.0;
        height = 10.0;
    }

    public Rectangle(double w, double h, String c, boolean f) {
        super(c, f);
        width = w;
        height = h;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (2 * width) + (2 * height);
    }

    public String toString() {
        return "The Rectangle has sides of " + width + " and " + height + "\n" +  super.toString();
    }

}
