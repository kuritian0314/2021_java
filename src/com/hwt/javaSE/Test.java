package com.hwt.javaSE;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2022/1/8 1:58
 * @Version V1.0
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> future = executorService.submit(() -> 10);
        executorService.shutdown();
        Integer result = future.get();
        System.out.println("执行结果：" + result);
    }
}
