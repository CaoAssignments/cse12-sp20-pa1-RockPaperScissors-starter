/**
 * TODO:  Add your name, ID, and email as specified in the instructions
 */

import org.junit.*;
import static org.junit.Assert.*;

public class CounterTest {
    private Counter counter, counter2;

    /* This sets up the test fixture. JUnit invokes this method before
       every testXXX method. The @Before tag tells JUnit to run this method
       before each test */
    @Before
    public void setUp() throws Exception {
        counter = new Counter();
        counter2 = new Counter(2);
    }

    /* The @Test tag tells JUnit this is a test to run */
    @Test
    public void testDefaultValueOfCounterIsZero() {
        System.out.println("Checking Default Counter Value is Zero");
        assertEquals(0, counter.getCount());
        assertEquals(0, counter2.getCount());
    }

    @Test
    public void testIncrement() {
        System.out.println("Checking Proper Increment");
        counter.increment();
        assertEquals(1, counter.getCount());
        counter2.increment();
        assertEquals(2, counter2.getCount());
    }

    @Test
    public void testMultipleIncrements() {
        System.out.println("Checking Multiple Increments");
        for (int i = 0; i < 10; i++) {
            counter.increment();
            assertEquals(i + 1, counter.getCount());
        }
    }

    @Test
    public void testReset() {
        System.out.println("Checking Reset");
        // TODO: Complete the Test Case to check if the reset 
        // functionality works as expected.
    }

    @Test
    public void testDecrement() {
        System.out.println("Checking Decrement");
        for (int i = 0; i < 5; i++) {
            counter.increment();
            counter2.increment();
        }

        for (int i = 0; i < 6; i++) {
            counter.decrement();
            counter2.decrement();
        }

        // TODO: Complete the Test Case to check if the decrement 
        // functionality works as expected.
    }
}
