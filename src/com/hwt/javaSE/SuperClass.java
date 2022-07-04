package com.hwt.javaSE;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2022/1/14 11:37
 * @Version V1.0
 */
public class SuperClass {
    private int i;

    static {
        System.out.println("父类静态代码块。。。");
    }

    public SuperClass(int i) {
        this.i = i;
        System.out.println("父类有参构造器。。。");
    }

//    public SuperClass() {
//        System.out.println("父类无参构造器。。。");
//    }

    {
        i = 10;
        System.out.println("父类成员初始化：" + i);
    }
}
