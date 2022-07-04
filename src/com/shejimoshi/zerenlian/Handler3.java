package com.shejimoshi.zerenlian;

/**
 * @author curry
 * @package java.shejimoshi
 * @date 2022/2/6 11:18
 * @Version V1.0
 */
public class Handler3 implements Handler {
    private Handler handler;

    @Override
    public void handleRequest(int number) {
        if (number == 200) {
            System.out.println("最后的处理者处理");
        } else {
            handler.handleRequest(number);
        }
    }

    @Override
    public void setNextHanlder(Handler hanlder) {
        this.handler = hanlder;
    }
}
