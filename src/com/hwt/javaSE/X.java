package com.hwt.javaSE;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2022/2/13 10:51
 * @Version V1.0
 */
public class X {
    /*
    * 程序执行顺序：父类静态块 子类静态块 父类成员初始化 父类构造快 子类成员初始化 子类构造快
    *
    * */

    static {
        System.out.println("X静态块");
    }
    //父类成员初始化
    Y y = new Y();

    //父类构造块
    public X() {
        System.out.println("X");
    }
}

class Y {
    public Y() {
        System.out.println("Y");
    }

    static {
        System.out.println("Y静态块");
    }
}

class Z extends X {
    static {
        System.out.println("Z静态块");
    }
    //子类成员初始化
    Y y = new Y();

    //子类构造块
    public Z() {
        System.out.println("Z");
    }

    public static void main(String[] args) {
        new Z();
    }

}

