public class ShapeApp {
    public static void main(String[] args) {
        Shape list[] = new Shape[2];
        list[0] = new Circle(10.0);
        list[1] = new Rect(10, 40);
        for (int i = 0; i < list.length; i++) {
            list[i].redraw();
        }

        for (int i = 0; i < list.length; i++) {
            System.out.println("Area : "+list[i].getArea());
        }
    }
}
