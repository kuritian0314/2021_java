package com.hwt.Thread;

/**
 * @author curry
 * @package com.hwt.Thread
 * @date 2021/10/15 1:03
 * @Version V1.0
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class SumTotal implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 50; i++) {
            if (i % 20 == 0) {
                System.out.println("sleep");
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + "  " + i);
            }
            sum += i;
        }

        return sum;
    }
}

class Main7 {
    public static void main(String[] args) {
        //实例化对象
        SumTotal sumTotal = new SumTotal();
        //创建FutureTask
        FutureTask<Integer> futureTask = new FutureTask<Integer>(sumTotal);
        //执行线程任务
        Thread thread = new Thread(futureTask);
        thread.setName("线程1");
        thread.start();

        //获取线程任务返回值

        try {
            int sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}