package com.hwt.future;

/**
 * @author curry
 * @package com.hwt.future
 * @date 2021/11/4 10:45
 * @Version V1.0
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("我是线程: " + Thread.currentThread().getName());
    }
}

class test {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        MyThread mt1 = new MyThread();
        mt.start();
        mt1.start();
    }
}
