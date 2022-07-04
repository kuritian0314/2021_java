package com.hwt.danli;

/**
 * @author curry
 * @package com.hwt.danli
 * @date 2022/4/3 3:20
 * @Version V1.0
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread run");
    }
}

class TestThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();

        myThread.setPriority(10);
        myThread.setName("myThread");
        System.out.println("myThread = " + myThread);

        myThread1.setPriority(1);
        myThread1.setName("myThread1");
        System.out.println("myThread1 = " + myThread1);

        myThread.start();
        myThread1.start();
    }
}
