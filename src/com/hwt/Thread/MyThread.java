package com.hwt.Thread;

/**
 * create by weihua on 2022/3/22
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("创建一个新线程");
    }
}

class Test {
    public static void main(String[] args) {
    }
}
