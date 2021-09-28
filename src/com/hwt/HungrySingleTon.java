package com.hwt;

//饿汉式
public class HungrySingleTon {
    // 1.创建私有的静态对象实例
    private static HungrySingleTon instance = new HungrySingleTon();
    // 2.私有的构造器
    private HungrySingleTon() {

    }
    // 3.公有的静态方法，返回实例对象
    public static HungrySingleTon getInstance() {
        return instance;
    }
}
