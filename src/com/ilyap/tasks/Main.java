package com.ilyap.tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long start = System.currentTimeMillis();
        System.out.println("fib(" + n + "): " + Fibonacci.fib(n));
        long end = System.currentTimeMillis();

        System.out.println("Time spent: " + (end - start) + " ms.");
        scanner.close();
    }
}
