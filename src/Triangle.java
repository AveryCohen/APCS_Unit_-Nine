public class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle() {
        super();
        side1 = 2.0;
        side2 = 2.0;
        side3 = 2.0;
    }

    public Triangle(double s1, double s2, double s3, String c, boolean f) {
        super(c, f);
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "The triangle has sides of " + side1 + " and " + side2 + " and " + side3 + "\n" +  super.toString();
    }




}
