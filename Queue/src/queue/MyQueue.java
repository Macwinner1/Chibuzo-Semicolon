package queue;

public class MyQueue {
    boolean isEmpty = true;
    String[] values;
    int size;
    int count;

    public MyQueue(int size) {
        values = new String[size];
    }

    public boolean isEmpty() {
        return count == 0;
    }
    public String[] size(int size) {
       return values = new String[count];
    }

    public void add(String value) {
        values[count++] = value;
        isEmpty = false;
    }

    public boolean remove() {
        --count;
        if (count != 0) {
            return isEmpty = false;
        }
        return isEmpty;
    }
}
