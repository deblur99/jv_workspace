public class CircleApp {
    public static void main(String[] args) {
        Shape donut = new Circle(10);
        donut.redraw();
        System.out.println("Area : "+donut.getArea());
    }
}