package tests;

import AirConditional.Aircondition;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestAircondition {

    @Test
    public void testAirConditional_is_on(){
        Aircondition aircondition = new Aircondition();
        assertTrue (aircondition.switchButtonOn());
    }

    @Test
    public void testAirconditioner_is_off(){
        Aircondition aircondition = new Aircondition();
        assertFalse(aircondition.switchButtonOff());
    }

    @Test
    public void testTemperature_is_increase(){
        Aircondition aircondition = new Aircondition();
        aircondition.incrementTemperature(2);
        assertEquals(aircondition.viewTemperature(), 27);
    }

    @Test
    public void testTemperature_is_decrease(){
        Aircondition aircondition = new Aircondition();
        aircondition.decrementTemperature(2);
        assertEquals(aircondition.viewTemperature(), 21);
    }

    @Test
    public void testTemperature_Max(){
        Aircondition aircondition = new Aircondition();
        aircondition.incrementTemperature(8);
        assertEquals(aircondition.viewTemperature(), 30);
    }
    @Test
    public void testTemperature_Min(){
        Aircondition aircondition = new Aircondition();
        aircondition.decrementTemperature(7);
        assertEquals(aircondition.viewTemperature(), 16);
    }

}