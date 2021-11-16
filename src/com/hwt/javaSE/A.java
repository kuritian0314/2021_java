package com.hwt.javaSE;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2021/11/3 20:36
 * @Version V1.0
 */
class A {
    int a;
    int b;
    public A(int m) {
        a = 100;
    }

//    public A() {
//
//    }
}

class B extends A {
    public B(int m, int n) {
        //子类继承父类，子类默认调用父类的无参构造方法，若父类没有无参构造方法，则子类要使用super显示的调用父类的有参构造方法
        super(m);
        a = 1;
    }

    public static void main(String[] args) {
        B b = new B(1_000_000, 10);
        System.out.println(b.a);
    }
}
