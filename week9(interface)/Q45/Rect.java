public class Rect implements Shape {
    double width, height;
    double area;

    public Rect(double w, double h) {
        width = w;
        height = h;
        area = width * height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle with size "+width+"x"+height);
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
