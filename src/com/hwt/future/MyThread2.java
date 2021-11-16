package com.hwt.future;

/**
 * @author curry
 * @package com.hwt.future
 * @date 2021/11/4 10:48
 * @Version V1.0
 */
public class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("我是线程: " + Thread.currentThread().getName());
    }
}

class Test {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);

        t1.setName("线程1");
        t2.setName("线程2");
        t1.setPriority(5);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
