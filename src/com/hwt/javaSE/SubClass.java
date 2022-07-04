package com.hwt.javaSE;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2022/1/14 11:38
 * @Version V1.0
 */
public class SubClass extends SuperClass {
    private int j;

    static {
        System.out.println("子类静态代码块。。。");
    }

    public SubClass(int j) {
        super(j);
        System.out.println("子类有参构造器。。。");
        System.out.println(j);
    }

//    public SubClass() {
//        super();
//        System.out.println("子类无参构造器。。。");
//    }

    {
        j = 11;
        System.out.println("子类成员初始化：" + j);
    }
}

class TestSuperSubClass {
    public static void main(String[] args) {
        SuperClass superClass = new SubClass(10);
    }
}
