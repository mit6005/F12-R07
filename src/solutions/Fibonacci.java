package solutions;

/**
 * Fibonacci calculator.
 */
public class Fibonacci {
    /**
     * Calculates {@code i}<sup>th</sup> Fibonacci number.  The Fibonacci
     * numbers are a sequence of numbers where each number is the sum of the
     * previous two, starting with 0 and 1.  Starting at {@code i = 0}, the
     * Fibonacci numbers are 0, 1, 1, 2, etc...
     *
     * @param i Index of number to calculate. Requires: that i >= 0;
     * @return The {@code i}<sup>th</sup> Fibonacci number.
     * @throws IllegalArgumentException if {@code i} is negative.
     */
    public static int fib(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("i must be >= 0, was:" + i);
        } else if (i == 0 || i == 1) {
            return i;
        } else {
            return fib(i - 2) + fib(i - 1);
        }
    }
}
