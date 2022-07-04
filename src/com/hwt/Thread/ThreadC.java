package com.hwt.Thread;

/**
 * @author curry
 * @package com.hwt.Thread
 * @date 2021/12/22 10:35
 * @Version V1.0
 */
public class ThreadC extends Thread {
    private ThreadB threadB;

    public void setThreadB(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (threadB) {
                synchronized (this) {
                    System.out.println("I am ThreadC...");
                    this.notify();
                }
                try {
                    threadB.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
