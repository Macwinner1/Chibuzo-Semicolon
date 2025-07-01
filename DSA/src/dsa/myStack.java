package dsa;

import java.util.EmptyStackException;

public class myStack {
    boolean isEmpty = true;
    int count;
    String[] values;

    public myStack(int size) {
        values = new String[size];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean push(String value) {
        values[count++] = value;
        isEmpty = false;
        return isEmpty;
    }

    public void pop() {
        if (isEmpty) {
            throw new StackUnderflowException();
        }
        count--;
    }
}
