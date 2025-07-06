package Bike;

public class Bike {
    private boolean isOn;
    private int speed;
    private int gear;

    public Bike(boolean isOn) {
        this.isOn = isOn;
        this.gear = 1;
    }

    public boolean BikeTurnedOn() {
        return isOn = true;
    }

    public boolean BikeTurnedOff() {
        return isOn = false;
    }
    public int getGear() {
        return gear;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.gear = 1;
        }
        if (speed > 20) {
            this.gear = 2;
        }
        if (speed > 30) {
            this.gear = 3;
        }
        if (speed > 40) {
            this.gear = 4;
        }
        this.speed += speed;
    }
    public void speedUp() {
        this.speed = speed + gear;
    }
    public void speedDown() {
        this.speed = speed - gear;
    }

}
