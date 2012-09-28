package solutions;



import static org.junit.Assert.assertEquals;
import static solutions.Fibonacci.fib;

import org.junit.Test;

/**
 * Tests for Fibonacci.
 */
public class FibonacciTest {
    /**
     * Helper-method for testing {@link Fibonacci#fib(int)}.
     * @param e Expected return value.
     * @param i Index of number to compute.
     */
    private void test(int e, int i) { assertEquals(e, fib(i)); }

    // Test the first several.

    @Test public void test0() { test(0, 0); }
    @Test public void test1() { test(1, 1); }
    @Test public void test2() { test(1, 2); }
    @Test public void test3() { test(2, 3); }
    @Test public void test4() { test(3, 4); }
    @Test public void test5() { test(5, 5); }

    // Test negative numbers.

    @Test(expected=IllegalArgumentException.class)
    public void testN1() { test(0, -1); }
    @Test(expected=IllegalArgumentException.class)
    public void testN2() { test(0, -2); }
    @Test(expected=IllegalArgumentException.class)
    public void testMinVal() { test(0, Integer.MIN_VALUE); }

    // What's missing?
}
