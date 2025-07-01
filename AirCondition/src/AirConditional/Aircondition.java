package AirConditional;

public class Aircondition {
    private boolean isSwitchedOff;
    private int temperatureControl;
    public int maxTemperature;
    public int minTemperature;

    public Aircondition() {
        int DEFAULT_TEMPERATURE = 24;
        temperatureControl = DEFAULT_TEMPERATURE;
        maxTemperature = 30;
        minTemperature = 16;

    }
    public boolean switchButtonOn() {
        isSwitchedOff = !isSwitchedOff;
        return isSwitchedOff;
    }
    public boolean switchButtonOff() {
        return isSwitchedOff;
    }
    public int viewTemperature() {
        return temperatureControl;
    }
    public void incrementTemperature(int increment) {
        temperatureControl = temperatureControl + increment;
        if(temperatureControl >= maxTemperature){
            temperatureControl = maxTemperature;
        }
        else {
            ++temperatureControl;
        }
    }
    public void decrementTemperature(int decrement) {
        temperatureControl = temperatureControl - decrement;
        if(temperatureControl <= minTemperature){
            temperatureControl = minTemperature;
        }
        else {
            --temperatureControl;
        }
    }

}

