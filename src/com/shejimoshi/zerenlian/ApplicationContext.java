package com.shejimoshi.zerenlian;

/**
 * @author curry
 * @package java.shejimoshi
 * @date 2022/2/6 1:28
 * @Version V1.0
 */

//责任链中的上下文对象，有两个方法：创建责任链处理对象并设置待处理者，响应客户端用户请求。
public class ApplicationContext {
    private Handler handler1;

    public void createChain() {
        handler1 = new Handler1();
        Handler handler2 = new Handler2();
        Handler handler3 = new Handler3();

        handler1.setNextHanlder(handler2);
        handler2.setNextHanlder(handler3);
    }

    public void responseClient(int num) {
        handler1.handleRequest(num);
    }
}
