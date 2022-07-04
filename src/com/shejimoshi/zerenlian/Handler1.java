package com.shejimoshi.zerenlian;

/**
 * @author curry
 * @package java.shejimoshi
 * @date 2022/2/6 1:20
 * @Version V1.0
 */
public class Handler1 implements Handler {
    private Handler handler;

    @Override
    public void handleRequest(int number) {
        if (number == 60) {
            System.out.println("处理者1处理");
        } else {
            handler.handleRequest(number);
        }
    }

    @Override
    public void setNextHanlder(Handler hanlder) {
        this.handler = hanlder;
    }
}
