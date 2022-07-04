package com.se;

/**
 * @author curry
 * @package com.se
 * @date 2022/2/22 15:51
 * @Version V1.0
 */

/**
 * 定义在方法中的内部类，就是局部内部类。
 */
public class Outer1 {
    // 外部类的成员变量
    private int out_a = 1;
    private static int STATIC_b = 2;

    // 局部内部类
    // 定义在成员方法内的内部类
    public void testFunctionClass() {
        // 内部类的成员变量
        int inner_c = 3;
        class Inner {
            private void fun() {
                System.out.println(out_a);
                System.out.println(STATIC_b);
                System.out.println(inner_c);
            }
        }
        Inner inner = new Inner();
        inner.fun();
    }

    // 局部内部类
    // 定义在静态方法内的内部类，
    public static void testStaticFunctionClass() {
        int d = 3;
        class Inner {
            private void fun() {
//                 System.out.println(out_a); //编译错误，定义在静态方法中的局部类不可以访问外部类的实例变量
                System.out.println(STATIC_b);
                System.out.println(d);
            }
        }
        Inner inner = new Inner();
        inner.fun();
    }

    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        outer1.testFunctionClass();
        System.out.println("======================");
        Outer1.testStaticFunctionClass();
    }
}
