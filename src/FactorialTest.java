


import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {
    private void test(int e, int n) { assertEquals(e, Factorial.fac(n)); }

    // Test basic numbers.

    @Test public void test0()  { test(      1,  0); }
    @Test public void test1()  { test(      1,  1); }
    @Test public void test2()  { test(      2,  2); }
    @Test public void test3()  { test(      6,  3); }
    @Test public void test4()  { test(     24,  4); }
    @Test public void test10() { test(3628800, 10); }

    // Test negative numbers

    @Test(expected=IllegalArgumentException.class)
    public void testN1()     { test(0,                -1); }
    @Test(expected=IllegalArgumentException.class)
    public void testN2()     { test(0,                -2); }
    @Test(expected=IllegalArgumentException.class)
    public void testMinVal() { test(0, Integer.MIN_VALUE); }

    // What is missing?
}
