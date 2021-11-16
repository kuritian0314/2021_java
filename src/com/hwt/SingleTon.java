package com.hwt;

//实现线程安全的懒汉式（双重检查加锁）
public class SingleTon {
//    // 1.创建私有的静态对象实例
//    private volatile static SingleTon instance = null;
//
//    // 2.私有的构造器
//    private SingleTon() {
//
//    }
//
//    // 3.公有的静态方法，返回实例对象
//    public static SingleTon getInstance() {
//        if (instance == null) {
//            synchronized (SingleTon.class) {
//                if (instance == null) {
//                    instance = new SingleTon();
//                }
//            }
//        }
//        return instance;
//    }

    private volatile static SingleTon instance = null;

    private SingleTon() {

    }

    public static SingleTon getInstance() {
        if (instance == null) {
            synchronized (SingleTon.class) {
                if (instance == null) {
                    instance = new SingleTon();
                }
            }
        }
        return instance;
    }

}
