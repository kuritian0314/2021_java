package com.se;

/**
 * 定义在类内部的静态类，就是静态内部类。
 * 静态内部类可以访问外部类所有的静态变量，而不可访问外部类的非静态变量；静态内部类的创建方式，new 外部类.静态内部类()
 */
public class Outer {
    private static int radius = 1;
    public static int len = 10;
    int a = 1;

    static class StaticInner {
        public void visit() {
            System.out.println("visit outer static  variable: " + radius);
            System.out.println("visit outer static  variable: " + len);
        }
    }
}

class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
//        int result = Outer.len;
        int result = outer.len;
        int b = outer.a;
        System.out.println(result);
        System.out.println(b);
        Outer.StaticInner inner = new Outer.StaticInner();
        inner.visit();
    }
}
