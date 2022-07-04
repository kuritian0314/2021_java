package com.hwt.ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author curry
 * @package com.hwt.ThreadPool
 * @date 2022/3/30 18:27
 * @Version V1.0
 */
public class Test01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //execute方法无返回值，传递的是一个Runnable类型的参数，任务若遇到异常，会抛出异常！
        //executorService.execute(() -> {
        //    System.out.println("任务开始...........");
        //    int a = 10 / 0;
        //    System.out.println("任务结束...........");
        //});
        //executorService.shutdown();

        //submit方法有返回值，返回一个Future<T>类型的返回值，传递的是Callable类型或Runnable类型的参数
        //任务若遇到异常时，不会抛出异常。可以通过get方法获取异常！
        Future future = executorService.submit(() -> {
            System.out.println("任务开始...........");
            int a = 10 / 0;
            System.out.println("任务结束...........");
        });
        Object o = future.get();
        System.out.println(o);
        executorService.shutdown();
    }
}
