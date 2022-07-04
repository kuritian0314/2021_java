package com.hwt.lambda;

@FunctionalInterface
public interface Runnable {
    public abstract void run();
}

class test {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("I am running");
    }
}
