import java.security.ProtectionDomain;
import java.util.Scanner;
public class Won2Dollar extends Converter {    
    public Won2Dollar(double input) {
        ratio = input;
    }

    protected double convert(double src) {
        return src / ratio;
    }
    
    protected String getSrcString() {
        return "KRW";
    }

    protected String getDestString() {
        return "USD";
    }
}   