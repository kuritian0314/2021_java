package com.shejimoshi.zerenlian;

//责任链接口中：定义了响应用户请求的方法，设置待处理者的方法
public interface Handler {
    //响应用户的请求
    public abstract void handleRequest(int number);
    //设置待处理者
    public abstract void setNextHanlder(Handler hanlder);
}
