package com.hwt.Thread;

import java.util.concurrent.*;

public class CallableTest implements Callable<Integer> {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<String> future = executor.submit(() -> {
            TimeUnit.SECONDS.sleep(5);
            return "CallableTest";
        });
        System.out.println(future.get());
        executor.shutdown();

    }

    @Override
    public Integer call() throws Exception {
        return null;
    }
}
