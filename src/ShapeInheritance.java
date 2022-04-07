public class ShapeInheritance extends Shape {

    public static void main(String[] args) {
        Circle c = new Circle(10, "pink", true);
        Triangle t = new Triangle(10, 10, 10, "pink", true);
        Rectangle r = new Rectangle(10, 10, "pink", true);
        Shape[] shapeList = new Shape[3];
        shapeList[0] = c;
        shapeList[1] = t;
        shapeList[2] = r;
        for (int i = 0; i < shapeList.length; i++) {
            double area = shapeList[i].getArea();
            System.out.println(area);
        }
    }

}
