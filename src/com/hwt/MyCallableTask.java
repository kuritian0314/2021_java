package com.hwt;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MyCallableTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return null;
    }

    Callable<Integer> mycallabletask = new MyCallableTask();

    FutureTask<Integer> futureTask = new FutureTask<Integer>(mycallabletask);

}
