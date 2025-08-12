import Pizza.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPizza {
    @Test
    public void test_pizza_for_vegetarian(){
        Pizza pizza = new Pizza(true);
        assertEquals(400, pizza.getPrice());
    }
    @Test
    public void test_pizza_for_Nonvegetarian(){
        Pizza pizza = new Pizza(false);
        assertEquals(300, pizza.getPrice());
    }
    @Test
    public void test_add_extra_chess_works(){
        Pizza pizza = new Pizza(false);
        pizza.addExtraChess();
        assertEquals(400, pizza.getPrice());
    }
    @Test
    public void test_Nonvegetarian_pizza_for_extra_chess_added(){
        Pizza pizza = new Pizza(false);
        pizza.addExtraChess();
        assertEquals(400, pizza.getPrice());
    }
    @Test
    public void test_vegetarian_pizza_for_extra_chess_added(){
        Pizza pizza = new Pizza(true);
        pizza.addExtraChess();
        assertEquals(500, pizza.getPrice());
    }

    @Test
    public void test_that_add_extra_toppings_works(){
        Pizza pizza = new Pizza(false);
        pizza.addExtraToppings();
        assertEquals(450, pizza.getPrice());
    }

    @Test
    public void test_Nonvegetarian_pizza_for_extra_toppings_added(){
        Pizza pizza = new Pizza(false);
        pizza.addExtraChess();
        pizza.addExtraToppings();
        assertEquals(550, pizza.getPrice());
    }

    @Test
    public void test_vegetarian_pizza_for_extra_toppings_added(){
        Pizza pizza = new Pizza(true);
        pizza.addExtraChess();
        pizza.addExtraToppings();
        assertEquals(650, pizza.getPrice());
    }
    @Test
    public void test_pizza_back_away_works(){
        Pizza pizza = new Pizza(false);
        pizza.addTakeAway();
        assertEquals(320, pizza.getPrice());
    }
    @Test
    public void test_that_pizza_total_bills_works(){
        Pizza pizza = new Pizza(true);
        pizza.addTakeAway();
        pizza.addExtraChess();
        pizza.addExtraToppings();
        assertEquals(670, pizza.getTotalBills());
    }


}
