package com.thread;

import java.util.concurrent.*;

/**
 * @author curry
 * @package com.thread
 * @date 2022/2/21 1:56
 * @Version V1.0
 */
public class ThreadExample1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("线程：" + Thread.currentThread().getName() + " I：" + i);
//                    if (i == 5) {
//                        Thread.yield();
//                    }
//                }
//            }
//        };
//        Thread t1 = new Thread(runnable, "T1");
//        Thread t2 = new Thread(runnable, "T2");
//        t1.start();
//        t2.start();

/*        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 10, 10L,
                TimeUnit.SECONDS, new LinkedBlockingQueue(20));
        // execute 使用
        executor.execute(() -> System.out.println("Hello, execute."));
        // submit 使用
        Future<String> future = executor.submit(() -> {
            System.out.println("Hello, submit.");
            return "Success";
        });
        System.out.println(future.get());*/

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 3, 10,
                TimeUnit.SECONDS, new LinkedBlockingQueue<>(2),
                new ThreadPoolExecutor.AbortPolicy()); // 添加 AbortPolicy 拒绝策略
        for (int i = 0; i < 6; i++) {
            executor.execute(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }

    }
}
