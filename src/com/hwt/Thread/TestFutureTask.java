package com.hwt.Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestFutureTask {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask futureTask = new FutureTask(() -> {
            Thread.sleep(3000L);
            System.out.println("返回执行结果");
            return "test1111";
        });
        System.out.println("等待执行结果");
        futureTask.run();
        String result = (String) futureTask.get();
        System.out.println("结果为：" + result);
    }
}
