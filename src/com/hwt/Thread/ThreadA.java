package com.hwt.Thread;

/**
 * @author curry
 * @package com.hwt.Thread
 * @date 2021/12/22 10:33
 * @Version V1.0
 */
public class ThreadA extends Thread {
    private ThreadC threadC;

    public void setThreadC(ThreadC threadC) {
        this.threadC = threadC;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (threadC) {
                System.out.println("I am ThreadA...");
                this.notify();
            }
            try {
                threadC.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
