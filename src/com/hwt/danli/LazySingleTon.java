package com.hwt.danli;

//懒汉式
public class LazySingleTon {
/*    // 1.创建私有的静态对象实例
    private static LazySingleTon instance = null;
    // 2.私有的构造器
    private LazySingleTon() {

    }
    // 3.公有的静态方法，返回实例对象
    public static LazySingleTon getInstance() {
        if (instance == null) {
            instance = new LazySingleTon();
        }
        return instance;
    }*/
    private static LazySingleTon instance = null;
    public LazySingleTon() {

    }

    public static LazySingleTon getInstance() {
        if (instance == null) {
            instance = new LazySingleTon();
        }
        return instance;
    }

}
class TestLazySingleTon {
    public static void main(String[] args) {
        LazySingleTon lazySingleTon = LazySingleTon.getInstance();
        LazySingleTon lazySingleTon1 = LazySingleTon.getInstance();
        System.out.println(lazySingleTon == lazySingleTon1);
    }
}
