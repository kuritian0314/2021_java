package com.thread;

/**
 * @author curry
 * @package com.thread
 * @date 2022/2/22 15:14
 * @Version V1.0
 */
public class Thread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("通过实现Runnable接口创建线程！！！");
    }
}

class Test2 {
    public static void main(String[] args) {
        Thread2 thread2 = new Thread2();
        Thread thread = new Thread(thread2);
        thread.start();

    }
}
