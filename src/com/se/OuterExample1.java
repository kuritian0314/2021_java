package com.se;

/**
 * @author curry
 * @package com.se
 * @date 2022/2/22 16:12
 * @Version V1.0
 */
//局部内部类，定义在方法体里面的内部类
public class OuterExample1 {
    private static int b = 1;

    void outMethod() {
        final int a = 10;
        class Inner {
            void innerMethod() {
                System.out.println("局部变量：" +a);
                System.out.println("外部成员变量：" +b);
            }
        }
    }
}

class TestExample3 {
    public static void main(String[] args) {
        OuterExample1 outerExample1 = new OuterExample1();
        outerExample1.outMethod();
    }
}

