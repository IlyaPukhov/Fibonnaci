package com.ilyap.tasks;

/**
 * Рекурсивный способ может работать долго, потому что в процессе вычисления
 * функция будет много раз вызываться от одного и того же аргумента
 * (например, при вычислении f(5) функция сделает рекурсивные вызовы к f(4) и f(3),
 * оба рекурсивных вызова обратятся к f(2)), что приведёт к
 * многократному повторению одних и тех же операций.
 * Поэтому было принято решение сделать кэш.
 */

public final class Fibonacci {
    private static final long[] cache = new long[93];

    private Fibonacci() {
    }

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
