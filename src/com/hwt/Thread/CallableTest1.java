package com.hwt.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest1 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int i = 0;
        for (;i < 10; i++) {
            System.out.println("当前线程是：：：" + Thread.currentThread() + ":" + i);
        }
        return i;
    }

    public static void main(String[] args) {
        CallableTest1 call = new CallableTest1();
        FutureTask<Integer> fu = new FutureTask<Integer>(call);
        Thread th = new Thread(fu, "我是fu线程");
        for (int i = 0; i < 3; i++) {
            System.out.println("当前线程是：：：" + Thread.currentThread().getName());
            if (i == 0) {
                th.start();
            }

        }
        try {
            System.out.println("返回值是：" + fu.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }
}
