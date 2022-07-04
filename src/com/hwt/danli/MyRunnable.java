package com.hwt.danli;

/**
 * @author curry
 * @package com.hwt.danli
 * @date 2022/4/3 3:09
 * @Version V1.0
 */
//Runnable runnable = () -> System.out.println("Hello World");
//Thread thread = new Thread(runnable);
//
//public static void main(String[] args) {
//    Test3 test3 = new Test3();
//    test3.thread.start();
//}

//实现Runnable接口，实现run方法
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World");
    }
}

class Test3 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        Thread thread1 = new Thread(new MyRunnable());

        thread.start();
        thread1.start();
    }
}
