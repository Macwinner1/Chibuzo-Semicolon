import org.junit.jupiter.api.Test;
import Bike.Bike;

import static org.junit.jupiter.api.Assertions.*;

public class TestBike {

    @Test
    public void test_that_bike_is_on(){
        Bike bike = new Bike(true);
        assertTrue(bike.BikeTurnedOn());
    }
    @Test
    public void test_that_bike_is_off(){
        Bike bike = new Bike(false);
        assertFalse(bike.BikeTurnedOff());
    }
    @Test
    public void test_that_bike_gear_starts_from_1(){
        Bike bike = new Bike(true);
        assertEquals(1,bike.getGear());
    }

    @Test
    public void test_that_bike_speed_can_be_set(){
        Bike bike = new Bike(true);
        bike.setSpeed(15);
        assertEquals(15, bike.getSpeed());
    }
    @Test
    public void test_that_bike_accelation_changes_gear(){
        Bike bike = new Bike(true);
        bike.setSpeed(41);
        assertEquals(4, bike.getGear());
    }
    @Test
    public void test_that_bike_accelation_speeds_up_by_number_of_gear(){
        Bike bike = new Bike(true);
        bike.setSpeed(4);
        bike.speedUp();
        assertEquals(5, bike.getSpeed());
    }
    @Test
    public void test_that_bike_accelation_speeds_down_by_number_of_gear(){
        Bike bike = new Bike(true);
        bike.setSpeed(40);
        bike.speedDown();
        assertEquals(37, bike.getSpeed());
    }









}
