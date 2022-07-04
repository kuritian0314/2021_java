package com.shejimoshi.zerenlian;

/**
 * @author curry
 * @package java.shejimoshi
 * @date 2022/2/6 1:24
 * @Version V1.0
 */
public class Handler2 implements Handler {
    private Handler handler;
    @Override
    public void handleRequest(int number) {
        if (number == 90) {
            System.out.println("处理者2处理");
        } else {
            handler.handleRequest(number);
        }

    }

    @Override
    public void setNextHanlder(Handler hanlder) {
        this.handler = hanlder;
    }
}
