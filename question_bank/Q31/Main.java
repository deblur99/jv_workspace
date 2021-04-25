public class Main {
    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint();
        System.out.println(zeroPoint.toString());

        ColorPoint cp = new ColorPoint(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp.toString());
    }
}