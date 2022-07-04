package com.hwt.javaSE;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2022/1/8 2:09
 * @Version V1.0
 */
public class Test02 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> 10);
        Integer result = completableFuture.get();
        System.out.println("执行结果是：" + result);
    }
}
