/*
package com.hwt.future;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FutureTaskForMultiCompute1 {

    public static void main(String[] args) {
        FutureTaskForMultiCompute1 inst = new FutureTaskForMultiCompute1();
        //创建任务集合
        List<FutureTask<Integer>> taskList = new ArrayList<>();
        Executor exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            //传入Callable对象创建FutureTask对象
            FutureTask<Integer> ft = new FutureTask<Integer>(inst.new ComputeTask(i, "" + i));
            taskList.add(ft);
            //提交给线程池执行任务
            exec.sumit(ft);
        }
        System.out.println("所有计算任务提交完毕，主线程接着干其他事情！");

        //开始统计各计算线程计算结果
        Integer totalResult = 0;
        for (FutureTask<Integer> ft : taskList) {
            try {
                totalResult = totalResult + ft.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        exec.shutdown();
        System.out.println("多任务计算后的总结果是：" + totalResult);
    }

    private class ComputeTask implements Callable<Integer> {
        private Integer result = 0;
        private String taskName = "";

        public ComputeTask(Integer iniResult, String taskName) {
            this.result = iniResult;
            this.taskName = taskName;
            System.out.println("生成子线程计算任务：" + taskName);
        }

        @Override
        public Integer call() throws Exception {
            for (int i = 0; i < 100; i++) {
                result = + i;
            }
            //休眠5秒钟，观察主线程行为，预期的结果是主线程会继续执行，到要取得FutureTask的结果时会等待直至完成。
            Thread.sleep(5000);
            System.out.println("子线程计算任务：" + taskName + " 执行完成！" + result);
            return result;
        }
    }
}
*/
