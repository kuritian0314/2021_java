package com.hwt.Thread;

public class Bground extends Thread {
    public static void main(String[] args) {
        Bground b = new Bground();
        b.start();
        b.start1();
    }

    public void start1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Value of i = " +i);
        }
    }
}
