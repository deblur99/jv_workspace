import java.util.Scanner;
public class Km2Mile extends Converter {
    public Km2Mile(double ratio) {
        this.ratio = ratio;
    }

    protected String getSrcString() {
        return "km";
    }

    protected String getDestString() {
        return "Mile";
    }

    protected double convert(double src) {
        return src / ratio;
    }
}