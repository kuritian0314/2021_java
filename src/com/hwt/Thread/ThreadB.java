package com.hwt.Thread;

/**
 * @author curry
 * @package com.hwt.Thread
 * @date 2021/12/22 10:35
 * @Version V1.0
 */
public class ThreadB extends Thread {
    private ThreadA threadA;

    public void setThreadA(ThreadA threadA) {
        this.threadA = threadA;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (threadA) {
                synchronized (this) {
                    System.out.println("I am ThreadB...");
                    this.notify();
                }
            }
            try {
                threadA.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
