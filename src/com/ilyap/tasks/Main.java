package com.ilyap.tasks;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(Fibonacci.fib(43));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
