import Pizza.Delux;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDelux {
    @Test
    public void test_Nonvegetarian_pizza_for(){
        Delux delux = new Delux(true);
        delux.addExtraToppings();
        delux.addExtraToppings();
        assertEquals(650, delux.getTotalBills());
    }
}
