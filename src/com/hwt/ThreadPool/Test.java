package com.hwt.ThreadPool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author curry
 * @package com.hwt.ThreadPool
 * @date 2022/4/3 1:58
 * @Version V1.0
 */
public class Test {
    //ThreadPoolExecutor方式创建单线程池
    private static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());

    public static void main(String[] args) {
        //提交任务
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("任务执行中");
            }
        });
        //关闭线程池
        threadPoolExecutor.shutdown();
    }
}
