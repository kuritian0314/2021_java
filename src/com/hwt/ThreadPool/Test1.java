package com.hwt.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author curry
 * @package com.hwt.ThreadPool
 * @date 2022/4/3 2:03
 * @Version V1.0
 */
public class Test1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(() -> System.out.println("hello world"));
    }
}
