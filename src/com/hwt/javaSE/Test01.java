package com.hwt.javaSE;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2022/1/8 2:04
 * @Version V1.0
 */
public class Test01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask = new FutureTask<Integer>(() -> 10);
        new Thread(futureTask).start();
        Integer result = futureTask.get();
        System.out.println("执行结果是：" + result);

    }
}
