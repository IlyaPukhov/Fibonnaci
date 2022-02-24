package com.ilyap.tasks;

public final class Fibonacci {
    private static final long[] cache = new long[200];

    public static long fib(int n) {
        if (n <= 1) {
            return n;
        } else if (cache[n] != 0) {
            return cache[n];
        } else {
            return cache[n] = fib(n - 1) + fib(n - 2);
        }
    }
}
