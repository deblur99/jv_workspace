// Q10
public class MyStack<T> implements IStack<T> {
    int tos;
    Object [] stack;

    public MyStack() {
        tos = 0;
        stack = new Object[10];
    }

    public boolean push(T ob) {
        if (tos == 10)  // full
            return false;
        
        stack[tos] = ob;
        tos++;
        return true;
    }

    public T pop() {
        if (tos == 0)
            return null;
        
        tos--;
        return (T)stack[tos];
    }

    
}
