public class Add extends Calc {
    void setValue(int op1, int op2) {
        a = op1; b = op2;
    }

    int calculate() {
        return a + b;
    }
}
