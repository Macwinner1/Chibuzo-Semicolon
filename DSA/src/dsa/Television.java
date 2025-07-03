package dsa;

public class Television {
    boolean isOn;

    public Television() {
        this.isOn = true;
    }
    public void toggle() {
        isOn  = !isOn;
    }
    public boolean isOn() {
        return isOn;
    }
}
