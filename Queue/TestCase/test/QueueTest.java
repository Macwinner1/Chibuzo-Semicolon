package test;

import org.junit.jupiter.api.Test;
import queue.MyQueue;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QueueTest {

    @Test
    public void test_that_queue_is_empty(){
        MyQueue myQueue = new MyQueue(5);
        assertTrue(myQueue.isEmpty());

    }

    @Test
    public void test_that_element_is_added(){
        MyQueue myQueue = new MyQueue(5);
        myQueue.add("hi");
        assertFalse(myQueue.isEmpty());
    }

    @Test
    public void test_that_one_element_added_and_one_deleted(){
        MyQueue myQueue = new MyQueue(5);
        myQueue.add("hi");
        assertFalse(myQueue.isEmpty());
        myQueue.remove();
        assertTrue(myQueue.isEmpty());
    }

    @Test
    public void test_that_two_element_added_and_one_removed(){
        MyQueue myQueue = new MyQueue(5);
        myQueue.add("hi");
        myQueue.add("home");
        assertFalse(myQueue.isEmpty());
        myQueue.remove();
        assertFalse(myQueue.isEmpty());
    }
}
