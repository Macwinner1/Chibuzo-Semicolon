import dsa.StackUnderflowException;
import dsa.myStack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class stackTest {
    @Test
    public void newStack_is_empty(){
        myStack string = new myStack(4);
        assertTrue(string.isEmpty());
    }

    @Test
    public void stack_is_not_empty_after_push(){
        myStack string = new myStack(4);
        assertTrue(string.isEmpty());
        string.push("okafor");
        assertFalse(string.isEmpty());
    }

    @Test
    public void stack_pop_from_back(){
        myStack string = new myStack(4);
        string.push("okafor");
        assertFalse(string.isEmpty());
        string.pop();
        assertTrue(string.isEmpty());
    }

    @Test
    public void should_push_two_pop_one(){
        myStack string = new myStack(4);
        assertTrue(string.isEmpty());
        assertThrows(StackUnderflowException.class, ()-> string.pop());

    }

}
