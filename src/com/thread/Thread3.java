package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author curry
 * @package com.thread
 * @date 2022/2/22 15:16
 * @Version V1.0
 */
public class Thread3 implements Callable<String> {
    @Override
    public String call() throws Exception {
//        System.out.println("通过实现Callable接口创建线程！！！");
        return "通过实现Callable接口创建线程！！！";
    }
}

class Test3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<String> ft = new FutureTask<>(new Thread3());
        ft.run();
        String result = ft.get();
        System.out.println(result);
    }
}
