package com.hwt.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallableTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return 111;
    }
}

class TestCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> mycallabletask = new MyCallableTask();

        FutureTask<Integer> futureTask = new FutureTask<Integer>(mycallabletask);
        futureTask.run();
        Integer i = futureTask.get();
        System.out.println("Callable执行call方法的结果为：" + i);
    }
}
