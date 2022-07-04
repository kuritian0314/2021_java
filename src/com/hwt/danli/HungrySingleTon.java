package com.hwt.danli;

//饿汉式
public class HungrySingleTon {
/*    // 1.创建私有的静态对象实例
    private static HungrySingleTon instance = new HungrySingleTon();
    // 2.私有的构造器
    private HungrySingleTon() {

    }
    // 3.公有的静态方法，返回实例对象
    public static HungrySingleTon getInstance() {
        return instance;
    }*/

    private static HungrySingleTon instance = new HungrySingleTon();
    private HungrySingleTon() {

    }

    public static HungrySingleTon getInstance() {
        return instance;
    }


}
class TestHungrySingleTon {
    public static void main(String[] args) {
        HungrySingleTon hungrySingleTon = HungrySingleTon.getInstance();
        HungrySingleTon hungrySingleTon1 = HungrySingleTon.getInstance();
        System.out.println(hungrySingleTon == hungrySingleTon1);
    }
}
