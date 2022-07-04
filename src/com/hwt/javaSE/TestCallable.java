package com.hwt.javaSE;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
* @package com.hwt.javaSE
* @author curry
* @date 2022/1/7 21:59
* @Version V1.0
*/
public class TestCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask ft = new FutureTask(new ThreadThree());
        ft.run();
        Object o = ft.get();
        System.out.println(o);
    }
}
