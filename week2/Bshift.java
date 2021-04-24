public class Bshift {
    public static void main(String[] args) {
        int a = 5, b = 20, c = 0xfffffff8;
        int d, e;
        a = a << 2;
        b = b >> 2;
        d = c >> 2; // disappear LSB until last one
        e = c >>> 2; // move LSB to the position of RSB. so sign is changed
        System.out.println(a + ", " + b + ", " + d + ", " + e);
    }
}
