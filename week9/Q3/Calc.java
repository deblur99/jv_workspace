abstract public class Calc {
    int a;
    int b;

    void setValue(int op1, int op2) {
        a = op1; b = op2;
    }

    abstract int calculate();
}