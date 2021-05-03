public class Circle implements Shape {
    double radius;
    double area;

    public Circle(double r) {
        radius = r;
        area = PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle with radius "+radius);
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void redraw() {
        System.out.print("-- Redraw : ");
        draw();
    }
}
